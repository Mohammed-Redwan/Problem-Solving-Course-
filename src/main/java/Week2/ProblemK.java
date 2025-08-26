// I Wanna Be the Guy Problem
package Week2;

import java.util.*;

public class ProblemK {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> levelLeft = new HashSet<>();
        int n = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= n; i++) {
            levelLeft.add(i);
        }
        int xLevels = input.nextInt();
        for (int i = 0; i < xLevels; i++) {
            int level = input.nextInt();
            deleteLevel(levelLeft, level);
        }
        input.nextLine();
        int yLevels = input.nextInt();
        for (int i = 0; i < yLevels; i++) {
            int level = input.nextInt();
            deleteLevel(levelLeft, level);
        }

        if (levelLeft.isEmpty()) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }

    public static void deleteLevel(HashSet set, int level) {
        if (set.contains(level)) {
            set.remove(level);
        }
    }
}

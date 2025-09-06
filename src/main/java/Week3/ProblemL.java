// Panagram Problem
package Week3;

import java.util.*;

public class ProblemL {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        HashSet<Character> letters = new HashSet<Character>();
        for (int i = (int) 'a'; i <= (int) 'z'; i++) {
            letters.add((char) i);
        }

        int n = input.nextInt();
        input.nextLine();

        String s = input.nextLine().toLowerCase();

        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (letters.contains(chars[i])) 
                letters.remove(chars[i]);
        }
        if (letters.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

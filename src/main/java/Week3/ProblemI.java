// New Year Garlandn Problem
package Week3;

import java.util.*;

public class ProblemI {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int r = input.nextInt();
            int g = input.nextInt();
            int b = input.nextInt();

            int smallest = Math.min(r, Math.min(g, b));
            int largest = Math.max(r, Math.max(g, b));
            int middle = r + g + b- smallest - largest;
            
            boolean canBuild = false;
            if (largest <= (middle + smallest + 1)) canBuild = true;

            if (canBuild) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

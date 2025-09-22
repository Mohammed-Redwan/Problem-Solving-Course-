// Pasha and Tea 
package Week4;

import java.util.*;

public class ProblemI {

    public static void solve() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] ai = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            ai[i] = sc.nextInt();
        }

        Arrays.sort(ai);

        double x = Math.min(ai[0], ai[n] / 2.0);
        double total = 3 * n * x;
        total = Math.min(total, w);

        System.out.print(total);
    }
}

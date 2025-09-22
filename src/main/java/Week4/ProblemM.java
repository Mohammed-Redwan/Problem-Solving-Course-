// George and Round
package Week4;

import java.util.*;

public class ProblemM {

    public static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = input.nextInt();
        }

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (b[j] < a[i]) {
                j++;
            } else {
                i++;
                j++;
            }
        }

        int result = n - i;
        System.out.println(result);
    }
}

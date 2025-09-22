// Burning Midnight Oil Problem
package Week4;

import java.util.*;

public class ProblemG {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int left = 0;
        int right = n;

        while (right > left) {
            int mid = (left + right) / 2;

            if (canWrite(mid, n, k)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }

    public static boolean canWrite(int v, int n, int k) {
        long total = 0;
        long current = v;

        while (current > 0) {
            total += current;
            if (total >= n) {
                return true;
            }
            current /= k;
        }

        return total >= n;
    }
}

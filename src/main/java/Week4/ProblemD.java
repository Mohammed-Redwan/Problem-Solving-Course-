

// Pair of Topics Problem
package Week4;

import java.util.*;

public class ProblemD {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] teacherT = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            teacherT[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = teacherT[i] - input.nextInt();
        }

        Arrays.sort(c);

        long result = 0;
        for (int i = 0; i < n; i++) {
            int firstIndex = upperBound(c, -c[i]);
            if (firstIndex <= i) {
                firstIndex = i + 1;
            }
            result += n - firstIndex;
        }

        System.out.println(result);

    }

    private static int upperBound(int[] arr, int key) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= key) {
                l = mid + 1; 
            } else {
                r = mid;               
            }
        }
        return l;
    }

}

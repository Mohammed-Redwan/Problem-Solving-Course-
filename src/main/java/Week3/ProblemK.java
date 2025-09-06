// Cumulative Sum Query 
package Week3;

import java.util.*;

public class ProblemK {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            nums.add(num);
        }
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums.get(i);
        }
        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            int sum = prefixSum[max + 1] - prefixSum[min];
            System.out.println(sum);
        }

    }
}

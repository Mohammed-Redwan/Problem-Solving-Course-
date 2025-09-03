// Find the missing number Problem
package Week3;

import java.util.*;

public class ProblemG {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int totalSum = n * (n + 1) / 2;

        int givenSum = 0;
        for (int i = 0; i < n - 1; i++) {
            givenSum += input.nextInt();
        }

        System.out.println(totalSum - givenSum);
    }
}

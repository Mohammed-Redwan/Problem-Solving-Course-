
// K-th Not Divisible by n Problem
package Week4;

import java.util.*;

public class ProblemC {

    public static void solve() {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int k = input.nextInt();

            int divNum = (int) Math.floor((k - 1) / (n - 1));
            System.out.println(k + divNum);
        }
    }
}

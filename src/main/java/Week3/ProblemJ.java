// The Rank Problem
package Week3;

import java.util.*;

public class ProblemJ {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int ta = input.nextInt();
        int tb = input.nextInt();
        int tc = input.nextInt();
        int td = input.nextInt();
        
        int thomasSum = ta + tb + tc + td;
        int thomasRank = 1;
        for (int i = 2; i <= n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();

            int sum = a + b + c + d;

            if (thomasSum < sum) {
                thomasRank++;
            }
        }
        System.out.println(thomasRank);

    }
}

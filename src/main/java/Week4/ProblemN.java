// Guess a Number! 
package Week4;

import java.util.*;

public class ProblemN {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int left = -2000000000;
        int right = 2000000000;

        for (int i = 0; i < n; i++) {
            String[] line = input.nextLine().split(" ");
            String sign = line[0];
            int num = Integer.parseInt(line[1]);
            char answer = line[2].charAt(0);

            if (sign.equals(">")) {
                if (answer == 'Y') {
                    left = Math.max(left, num + 1);
                } else {
                    right = Math.min(right, num);
                }
            } else if (sign.equals(">=")) {
                if (answer == 'Y') {
                    left = Math.max(left, num);
                } else {
                    right = Math.min(right, num - 1);
                }
            } else if (sign.equals("<")) {
                if (answer == 'Y') {
                    right = Math.min(right, num - 1);
                } else {
                    left = Math.max(left, num);
                }
            } else if (sign.equals("<=")) {
                if (answer == 'Y') {
                    right = Math.min(right, num);
                } else {
                    left = Math.max(left, num + 1);
                }
            }
        }

        if (right >= left) {
            System.out.println(left);
        } else {
            System.out.println("Impossible");
        }
    }

}

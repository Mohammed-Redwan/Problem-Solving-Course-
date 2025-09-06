//Case of the Zeros and Ones
package Week3;

import java.util.*;

public class ProblemN {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        char[] string = input.nextLine().toCharArray();
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < n ; i++) {
            if (string[i] == '0')
                ones++;
            else
                zeros++;
        }
        System.out.println(Math.abs(ones - zeros));

    }
}

// Adding reversed Numbers Problem
package Week2;

import java.util.*;

public class ProblemG {

    public static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            String[] nums = input.nextLine().split(" ");

            String num1S = reverseString(nums[0]);
            String num2S = reverseString(nums[1]);

            int num1 = Integer.parseInt(num1S);
            int num2 = Integer.parseInt(num2S);

            int sum = (num1 + num2);
            String result = reverseString("" + sum);
            int intResult = Integer.parseInt(result);
            System.out.println(intResult);
        }
    }

    public static String reverseString(String string) {
        char[] s = string.toCharArray();
        Stack<Character> reverse = new Stack<Character>();
        for (char c : s) {
            reverse.push(c);
        }
        String result = "";
        while (!reverse.empty()) {
            result += reverse.pop();
        }
        return result;
    }
}

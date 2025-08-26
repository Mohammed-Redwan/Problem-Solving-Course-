
 //Second Order Statistics Problem
package Week2;

import java.util.*;

/**
 *
 * @author abdullah
 */
public class ProblemO {

    public static void solve() {
        Scanner input = new Scanner(System.in);

        TreeSet<Integer> nums = new TreeSet<>();
        int n = input.nextInt();
        input.nextLine();
        String[] numChars = input.nextLine().split(" ");

        for (int i = 0; i < numChars.length; i++) {
            int current = Integer.parseInt(numChars[i]);
            nums.add(current);
        }
        if (nums.size() < 2) {
            System.out.println("NO");
            return;
        }
        Iterator<Integer> it = nums.iterator();
        it.next();

        System.out.println(it.next());
    }
}

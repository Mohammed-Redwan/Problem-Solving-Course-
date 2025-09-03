// Grow The Tree Problem
package Week3;

import java.util.*;

public class ProblemD {
    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        PriorityQueue<Integer> nums = new PriorityQueue<Integer>(Integer::compare);
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            nums.add(num);
        }
        int odd = 0;
        int even = 0;
        int i = 0;
        while (!nums.isEmpty()) {
            if (i % 2 == 0) {
                even += nums.poll();
            } else {
                odd += nums.poll();
            }
            i++;
        }
        System.out.println(Math.pow(odd, 2) + Math.pow(even, 2));
    }
}

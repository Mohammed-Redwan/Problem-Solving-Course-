package Week3;

import java.util.*;

public class ProblemB {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Queue<Integer> nums = new PriorityQueue<Integer>(Integer::compare);
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            nums.add(num);
        }
        while (!nums.isEmpty()) {
            System.out.print(nums.poll() + " ");
        }
    }
}

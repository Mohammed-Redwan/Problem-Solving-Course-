/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.*;

/**
 *
 * @author abdullah
 */
public class ProblemA {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            PriorityQueue<Integer> nums = new PriorityQueue<>(Integer::compare);
            for (int j = 0; j < n; j++) {
                int num = input.nextInt();
                nums.add(num);
            }
            while (k > 0) {
                int smallest = nums.poll();
                if (smallest >= 0) {
                    nums.add(smallest);
                    break;
                }
                nums.add(smallest * -1);

                k--;
            }
            if (k == 0) {
                result(nums);

            } else {
                if (k % 2 == 0) {
                    result(nums);
                } else {
                    int smallest = nums.poll();
                    nums.add(smallest * -1);
                    result(nums);
                }
            }
        }
    }

    public static void result(Queue<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}

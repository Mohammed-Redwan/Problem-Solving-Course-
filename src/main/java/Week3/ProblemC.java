/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.*;

public class ProblemC {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            nums.add(num);
        }
        System.out.println(maxLengthSorted(nums));
    }

    public static boolean isSorted(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static int maxLengthSorted(List<Integer> nums) {
        if (nums.size() == 0) {
            return 0;
        }
        if (isSorted(nums)) {
            return nums.size();
        }
        int middle = (nums.size()) / 2;
        List<Integer> left = new ArrayList<>(nums.subList(0, middle));
        List<Integer> right = new ArrayList<>(nums.subList(middle, nums.size()));

        return Math.max(maxLengthSorted(left), maxLengthSorted(right));
    }

}

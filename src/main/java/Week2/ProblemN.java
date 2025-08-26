// Good Sequence Problem
package Week2;

import java.util.*;
import java.util.Map.Entry;

public class ProblemN {

    public static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i < n; i++) {

            int current = input.nextInt();
            nums.put(current, nums.getOrDefault(current, 0) + 1);
        }

        Iterator<Entry<Integer, Integer>> it = nums.entrySet().iterator();
        int minToRemove = 0;
        while (it.hasNext()) {
            Entry<Integer, Integer> current = it.next();
            int key = current.getKey();
            int frq = current.getValue();

            if (key > frq) {
                minToRemove += frq;
            } else if (frq > key) {
                minToRemove += frq - key;
            }
        }
        System.out.println(minToRemove);
    }
}

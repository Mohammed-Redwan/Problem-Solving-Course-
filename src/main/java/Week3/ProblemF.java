// Amr and The Large Array Problem
package Week3;

import java.util.*;

public class ProblemF {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Integer, AppearanceHandler> nums = new HashMap<Integer, AppearanceHandler>();

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            if (nums.containsKey(num)) {
                nums.get(num).newAppeare(i);
            } else {
                nums.put(num, new AppearanceHandler(i, num));
            }
        }
        AppearanceHandler result = null;
        for (AppearanceHandler handler : nums.values()) {
            if (result == null) {
                result = handler;
                continue;
            }
            if (handler.getTimes() > result.getTimes()) {
                result = handler;
            } else if (handler.getTimes() == result.getTimes()) {
                if (handler.getLength() < result.getLength()) {
                    result = handler;
                }
            }
        }
        System.out.println(result.getFirst() + " " + result.getLast());
    }

    private static class AppearanceHandler {

        private int num;
        private int firstIndex;
        private int lastIndex;
        private int times;

        public AppearanceHandler(int firstIndex, int num) {
            this.num = num;
            this.firstIndex = this.lastIndex = firstIndex;
            this.times = 1;
        }

        public int getLength() {
            return lastIndex - firstIndex;
        }

        public int getFirst() {
            return firstIndex + 1;
        }

        public int getLast() {
            return lastIndex + 1;
        }

        public int getNum() {
            return this.num;
        }

        public int getTimes() {
            return times;
        }

        public void newAppeare(int index) {
            this.lastIndex = index;
            times++;
        }

        @Override
        public boolean equals(Object obj) {
            AppearanceHandler b = (AppearanceHandler) obj;
            return this.num == b.getNum();
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(num);
        }
    }
}

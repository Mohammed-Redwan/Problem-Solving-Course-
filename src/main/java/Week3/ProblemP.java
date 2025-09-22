// Worms Problem
package Week3;

import java.util.*;

public class ProblemP {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Pile> piles = new ArrayList<>();
        int first = input.nextInt();
        piles.add(new Pile(1, first));
        for (int i = 1; i < n; i++) {
            int a = input.nextInt();
            int prev = piles.get(i - 1).last;
            piles.add(new Pile(prev + 1, prev + a));
        }
        
        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int q = input.nextInt();
            int l = 0;
            int r = piles.size() - 1;

            while (l <= r) {
                int middle = (l + r) / 2;
                if (piles.get(middle).isBigger(q)) {
                    l = middle + 1;
                } else if (piles.get(middle).isLower(q)) {
                    r = middle - 1;
                } else {
                    System.out.println(middle + 1);
                    break;
                }
            }
        }
    }

    public static class Pile {

        public int first;
        public int last;

        public Pile(int first, int last) {
            this.first = first;
            this.last = last;
        }
        public boolean isBigger(int num) {
            if (num > last) {
                return true;
            }
            return false;
        }

        public boolean isLower(int num) {
            if (num < first) {
                return true;
            }
            return false;
        }
    }

}

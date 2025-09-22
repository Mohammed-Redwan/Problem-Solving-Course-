
// Snake Move : X
package Week4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // number of hobbits
        int m = input.nextInt(); // pillows
        int k = input.nextInt(); //beds

        if (m % n > 0) {
            System.out.println(1 + m / n);
        } else {
            System.out.println(m / 2);
        }
    }
}

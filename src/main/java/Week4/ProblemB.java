
//Books Problem
package Week4;

import java.util.*;

public class ProblemB {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        int left = 0, time = 0, books = 0;
        for (int right = 0; right < n; right++) {
            time += a[right];
            while (time > t) {     
                time -= a[left];
                left++;
            }
            books = Math.max(books, right - left + 1);
        }
        System.out.println(books);

    }
}

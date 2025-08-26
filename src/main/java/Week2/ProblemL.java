//Tom Riddle's Diary Problem
package Week2;

import java.util.*;
import javax.crypto.Cipher;

public class ProblemL {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        

        int n = input.nextInt();
        input.nextLine();
        HashSet<String> names = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            if (!names.contains(s)) {
                System.out.println("NO");
                names.add(s);
            } else {
                System.out.println("YES");
            }

        }
    }
}

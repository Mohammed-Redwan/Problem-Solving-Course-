

// Palindrome Reorder Problem
package Week2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ProblemF {

    public static void solve() {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char oddkey = 0;
        int numOfOdd = 0;
        boolean noSolution = false;
        for (char c : map.keySet()) {
            int frq = map.getOrDefault(c, 0);
//            System.out.println("frq of " + c + " = " + frq);
            if (frq % 2 != 0) {
                result[s.length() / 2] = c;
                oddkey = c;
                numOfOdd++;
            }
            if (numOfOdd > 1) {

                noSolution = true;
                break;
            }
        }

        if (map.containsKey(oddkey)) {
            if (map.getOrDefault(oddkey, 0) == 1) {
                map.remove(oddkey);
            } else {
                map.put(oddkey, map.getOrDefault(oddkey, numOfOdd) - 1);
            }
        }

        int currentIndex = 0;
        if (noSolution) {
            System.out.println("NO SOLUTION");
            return;
        } else {
            for (char c : map.keySet()) {
                int freq = map.getOrDefault(c, 0);
                for (int i = 0; i < freq / 2; i++) {
                    result[i + currentIndex] = c;
                    result[(result.length - 1) - (currentIndex + i)] = c;

                }
                currentIndex += freq / 2;
            }

        }
        System.out.println(result);

    }

}

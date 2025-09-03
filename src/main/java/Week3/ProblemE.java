// Shuffle Hashing Problem
package Week3;

import java.util.*;

public class ProblemE {

    public static void solve() {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        input.nextLine();
        for (int i = 0; i < t; i++) {
            String s = input.nextLine();
            String h = input.nextLine();

            int firstIndex = 0;
            int lastIndex = s.length();
            boolean found = false;
            while (lastIndex <= h.length()) {
                String b = h.substring(firstIndex, lastIndex);
                if (isShuffledWord(s, b)) {

                    System.out.println("YES");
                    found = true;
                    break;
                }
                firstIndex++;
                lastIndex++;
            }
            if (!found) {
                System.out.println("NO");
            }
        }
    }

    public static boolean isShuffledWord(String a, String b) {
        if (a.length() != b.length()) {
            return false; 
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) < 0) {
                return false;             }
        }

        return true;
    }
}

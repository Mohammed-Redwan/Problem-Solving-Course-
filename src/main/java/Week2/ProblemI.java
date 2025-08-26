//Hat’s Words Problem
package Week2;

import java.util.*;

public class ProblemI {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        HashSet<String> wordsSet = new HashSet<>();
        ArrayList<String> words = new ArrayList<>();
        PriorityQueue<String> hatWords = new PriorityQueue<>();
        while (input.hasNextLine()) {
            String word = input.nextLine();
            words.add(word);
            wordsSet.add(word);
        }
        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                String part1 = word.substring(0, i);
                String part2 = word.substring(i);

                if (wordsSet.contains(part1) && wordsSet.contains(part2)) {
                    hatWords.add(word);
                    break;
                }
            }
        }
        while (!hatWords.isEmpty()) {
            System.out.println(hatWords.poll());
        }
    }
}

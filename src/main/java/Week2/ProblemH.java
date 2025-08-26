//Let the Balloon Rise Problem
package Week2;

import java.util.*;

public class ProblemH {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        while (true) {

            int n = input.nextInt();
            if (n <= 0) {
                break;
            }
            input.nextLine();

            BalloonWave wave = new BalloonWave();

            for (int i = 0; i < n; i++) {
                String color = input.nextLine();
                wave.addOne(color);
            }
            System.out.println(wave.getMostFreq());
        }
    }

    private static class BalloonWave {

        HashMap<String, Integer> dictionary;

        public BalloonWave() {
            dictionary = new HashMap<String, Integer>();
        }

        public void addOne(String color) {
            dictionary.put(color, dictionary.getOrDefault(color, 0) + 1);
        }

        public String getMostFreq() {
            int mostFreq = 0;
            String result = "";
            for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
                if (entry.getValue() > mostFreq) {
                    mostFreq = entry.getValue();
                    result = entry.getKey();
                }
            }
            return result;
        }
    }

}


// Snake Moves Problem : X
package Week4;

import java.util.*;

public class ProblemE {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String movesSquance = input.nextLine();
        int x = 0;
        int y = 0;
        ArrayList<Integer> distances = new ArrayList<>();
        distances.add(0);
        HashSet<Pair> places = new HashSet<>();
//        places.add(new Pair(0,0));
        for (int i = 0; i < n; i++) {
            char move = movesSquance.charAt(i);
            if (isVertical(move)) {
                y += getMove(move);
            } else {
                x += getMove(move);
            }
            Pair currentPlace = new Pair(x, y);
            int currentLength = distances.size() - 1;
            if (!places.contains(currentPlace)) {
                places.add(currentPlace);
                distances.set(currentLength, distances.get(currentLength) + 1);
            } else {
                distances.add(0);
                places = new HashSet<>();
            }
        }
        int max = Collections.max(distances);
        System.out.println(max);
    }

    static int getMove(char move) {
        if (move == 'U' || move == 'L') {
            return 1;
        } else {
            return -1;
        }
    }

    static boolean isVertical(char move) {
        if (move == 'U' || move == 'D') {
            return true;
        } else {
            return false;
        }
    }

    static class Pair {

        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            Pair other = (Pair) o;
            if (this.x == other.x && this.y == other.y) {
                return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}

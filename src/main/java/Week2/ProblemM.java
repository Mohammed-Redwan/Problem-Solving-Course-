//Registration System Problem
package Week2;

import java.util.*;

public class ProblemM {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        ArrayList<String> responses = new ArrayList<>();
        HashMap<String, Integer> dataBase = new HashMap<>();

        int prevSize = 0;
        for (int i = 0; i < n; i++) {
            String request = input.nextLine();
            dataBase.put(request, dataBase.getOrDefault(request, -1) + 1);
            if (dataBase.size() > prevSize) {
                responses.add("OK");
            } else {
                responses.add(request + dataBase.getOrDefault(request, 0));
            }
            prevSize = dataBase.size();
        }

        for (String s : responses) {
            System.out.println(s);
        }
    }
}

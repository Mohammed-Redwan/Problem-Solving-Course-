


// A and B and Compilation Errors Problem
package Week2;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ProblemE {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        String[] intChars1 = input.nextLine().split(" ");
        String[] intChars2 = input.nextLine().split(" ");
        String[] intChars3 = input.nextLine().split(" ");

        long firstLine = Long.parseLong(intChars1[n - 1]) + Integer.parseInt(intChars1[n - 2]);
        long secondLine = Long.parseLong(intChars2[n - 2]);
        long thirdLine = 0;

        for (int i = 0; i < n - 2; i++) {
            firstLine += Long.parseLong(intChars1[i]);
            secondLine += Long.parseLong(intChars2[i]);
            thirdLine += Long.parseLong(intChars3[i]);
        }
        System.out.println(firstLine - secondLine);
        System.out.println(secondLine - thirdLine);
    }
}

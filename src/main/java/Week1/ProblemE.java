/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ProblemE {

    public void solve() {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        for (int i = 0; i < testCases; i++) {
            String a = input.next();
            char[] b = new char[a.length()];

            for (int j = 0; j < a.length(); j++) {
                int revIndex = a.length() - 1 - j;
                if (a.charAt(j) == 'q') {
                    b[revIndex] = 'p';
                } else if (a.charAt(j) == 'p') {
                    b[revIndex] = 'q';
                } else {
                    b[revIndex] = 'w';
                }
            }
            System.out.println(new String(b));
        }
    }
}

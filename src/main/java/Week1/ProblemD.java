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
public class ProblemD {

    public void solve() {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        input.nextLine();
        for (int i = 0; i < testCases; i++) {

            String s = input.nextLine();
            for (int j = 0; j < s.length() - 2; i++) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    System.out.println(1);
                    return;
                }
            }
            System.out.println(s.length());
        }
    }
}

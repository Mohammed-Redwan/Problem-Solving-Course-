/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Way Too Long Words Problem
package Week1;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ProblemI {

    void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String word = input.next();
            String result = word;
            if (word.length() > 10) {
                result = word.charAt(0) + ""
                        + (word.length() - 2)
                        + word.charAt(word.length() - 1);
            }
            System.out.println(result);
        }
    }
}

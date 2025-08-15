/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Down with Brackets Problem
package Week1;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ProblemF {

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        while (t-- > 0) {
            String s = in.nextLine();
            int n = s.length();
            int bal = 0;
            boolean found = false;

            for (int i = 1; i + 1 < n; i++) {
                if (s.charAt(i) == '(') {
                    bal++;
                } else {
                    bal--;
                }
                if (bal < 0) {
                    found = true;
                    System.out.println("YES");
                    break;
                }
            }

            if (!found) {
                if (bal == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }

        in.close();
    }
}

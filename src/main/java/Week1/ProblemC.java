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
public class ProblemC {

    public int solve() {
        Scanner input = new Scanner(System.in);

        int n = 0, k = 0;

        System.out.println("First line n space k");
        String firstLine = input.nextLine();

        n = firstLine.charAt(0) - '0';
        k = firstLine.charAt(2) - '0';

        int result = 0;
        System.out.println("Participent String");
        String[] participants = input.nextLine().split(" ");
        for (int i = 0; i < k; i++)
        {
            if (Integer.parseInt(participants[i]) > 0)
                result++;
        }
        for (int i = k; i < n; i++) {
            
            if (Integer.parseInt(participants[i]) >= Integer.parseInt(participants[k]) && Integer.parseInt(participants[i]) > 0) {
                result++;
            }
        }

        return result;
    }
}

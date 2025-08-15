/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Bit++ Problem
package Week1;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ProblemB {

    public int Solve() {
        Scanner input = new Scanner(System.in);

        int numberOfLines = input.nextInt();

        int xValue = 0;
        for (int i = 0; i < numberOfLines; i++) {
            String statment = input.next();
            for (int j = 0; j < statment.length(); j++) {
                if (statment.charAt(j) == '+') {
                    xValue++;
                    break;
                } else if (statment.charAt(j) == '-') {
                    xValue--;
                    break;
                }
            }
        }
        return xValue;
    }
}

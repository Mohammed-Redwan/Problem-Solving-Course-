/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.Scanner;
import javax.print.attribute.standard.NumberOfInterveningJobs;

/**
 *
 * @author abdullah
 */
public class ProblemA {
 
    int solve() {
        Scanner input = new Scanner(System.in);

        int numberOfProblem = input.nextInt();

        boolean[][] solotions = new boolean[numberOfProblem][3];
        //Petya : first bool in each line;
        //Vasya : second bool in each line;
        //Tonya : third bool in each line;
        int numberOfProblemsImplemented = 0;
        for (int i = 0; i < numberOfProblem; i++) {
            solotions[i][0] = input.nextInt() > 0 ? true : false;
            solotions[i][1] = input.nextInt() > 0 ? true : false;
            solotions[i][2] = input.nextInt() > 0 ? true : false;

            int viewCounter = 0;
            for (int j = 0; j < 3; j++) {
                if (solotions[i][j]) {
                    viewCounter++;
                }
            }
            if (viewCounter >= 2) {
                numberOfProblemsImplemented++;
            }
        }
        return numberOfProblemsImplemented;
    }
}

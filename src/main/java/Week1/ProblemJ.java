/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Progress Bar Problem
package Week1;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ProblemJ {

    public void solve() {
        Scanner input = new Scanner(System.in);
        String[] inputs = input.nextLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        float t = Integer.parseInt(inputs[2]);

        int amount = (int) ((t / 100) * (n * k));
        System.out.println(" amount = " + amount + " N: " + n + " K:" + k);
        int fullSquare = amount / k;
        int reminder = amount % k;
        int emptySquare = n - fullSquare;

        for (int i = 0; i < fullSquare; i++) {
            System.out.print(k + " ");
        }
        if (reminder != 0) {
            emptySquare--;
            System.out.print(reminder + " ");
        }

        for (int i = 0; i < emptySquare; i++) {
            System.out.print(0 + " ");
        }

    }
}

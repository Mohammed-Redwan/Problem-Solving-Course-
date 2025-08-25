/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Collecting Numbers
package Week2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import javafx.util.Pair;

public class ProblemD {

    public static void solve() {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        input.nextLine();
        int[] nums = new int[size];
        int[] positions = new int[size + 1];
        String[] chars = input.nextLine().split(" ");
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(chars[i]);
            positions[nums[i]] = i;
        }
        int rounds = 1;
        for (int i = 2; i <= size; i++) {
            if (positions[i] < positions[i - 1]) {
                rounds++;
            }

        }
        System.out.println(rounds);
    }
}

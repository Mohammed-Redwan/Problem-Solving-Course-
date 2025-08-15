/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ProblemH {

    void solve() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        boolean result = false;
        int distinctChar = name.length();
        HashSet<Character> map = new HashSet<>();
        for (int i = 0; i < name.length(); i++) {
            if (map.contains(name.charAt(i))) {
                distinctChar--;
            }
            map.add(name.charAt(i));

        }
        if (distinctChar % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author abdullah
 */
public class ProblemB {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        TreeMap<Integer, Integer> map = new TreeMap<>();

        String[] numChars = s.split("\\+");
        for (int i = 0; i < numChars.length; i++) {
            int num = Integer.parseInt(numChars[i]);

            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        String output = "";
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                output += entry.getKey() + " ";
            }
        }
        output = output.trim();
        output = output.replaceAll(" ", "+");
        System.out.println(output);

    }
}

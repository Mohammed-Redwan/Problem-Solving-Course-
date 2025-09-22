
//Petya and Java Problem
package Week4;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author abdullah
 */
public class ProblemA {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        BigInteger num = new BigInteger(n);

        if (num.compareTo(BigInteger.valueOf(127)) <= 0) {
            System.out.println("byte");
        } else if (num.compareTo(BigInteger.valueOf(32767)) <= 0) {
            System.out.println("short");
        } else if (num.compareTo(BigInteger.valueOf(2147483647)) <= 0) {
            System.out.println("int");
        } else if (num.compareTo(BigInteger.valueOf(9223372036854775807L)) <= 0) {
            System.out.println("long");
        } else {
            System.out.println("BigInteger");
        }

    }
}

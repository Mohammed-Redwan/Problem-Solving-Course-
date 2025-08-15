package Week1;

import java.util.Scanner;

public class ProblemG {

    public double solve() {
        Scanner input = new Scanner(System.in);
        String[] firstLine = input.nextLine().split(" ");

        int n = Integer.parseInt(firstLine[0]);
        int t = Integer.parseInt(firstLine[1]);

        double base = 1.000000011;

        double result = binaryExponentiation(base, t);
        return n * result;

    }

    public double binaryExponentiation(double base, int power) {
        double result = 1;

        while (power > 0) {
            if (power % 2 == 1) {
                result = result * base;
            }
            base = base * base;
            power = power / 2;
        }

        return result;
    }
}

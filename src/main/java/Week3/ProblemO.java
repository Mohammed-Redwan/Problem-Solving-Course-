//Ilya and Queries
package Week3;

import java.util.*;

public class ProblemO {

    public static void solve() {
        Scanner input = new Scanner(System.in);
        char[] s = input.nextLine().toCharArray();
        
        int[] prefixSum = new int[s.length + 1];
        prefixSum[0] = 0;
        for (int i = 1; i < prefixSum.length - 1; i++)
        {
            prefixSum[i] = prefixSum[i - 1];
            if (s[i] == s[i - 1])
                prefixSum[i] = prefixSum[i] + 1;
          
        }
        
        
        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int l = input.nextInt();
            int r = input.nextInt();

            int result = prefixSum[r - 1] - prefixSum[l - 1];
            
            System.out.println(result);
        }
    }
}

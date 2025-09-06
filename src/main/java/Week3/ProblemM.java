

// Smallest Difference Problem
package Week3;
import java.util.*;

public class ProblemM {
    public static void solve()
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++)
        {
            HashMap<Integer, Integer> nums = new HashMap<>();
            int n = input.nextInt();
            
            for (int j = 0; j < n; j++)
            {
                int num = input.nextInt();
                nums.put(num, nums.getOrDefault(num, 0) + 1);
            }
            
            int maxGroup = 0;
            for (int num : nums.keySet())
            {
                int prev = nums.getOrDefault( num - 1, 0);
                maxGroup = Math.max(maxGroup, prev + nums.getOrDefault(num, 0));
            }
            System.out.println(maxGroup);
        }
    }
}

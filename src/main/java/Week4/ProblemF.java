

// Queries about less or equal elements
package Week4;
import java.util.*;

public class ProblemF {
    public static void solve()
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++)
        {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < m; i++)
        {
            b[i] = input.nextInt();
        }
        Arrays.sort(a);
//        Arrays.sort(b);
        
        for (int key : b)
        {
            System.out.println(upperBoundIndex(key, a));
        }
        
    }
    public static int upperBoundIndex(int key, int[] arr)
    {
        int left = 0; 
        int right = arr.length;
        
        while(right > left)
        {
            int mid = (left + right) / 2;
            if (arr[mid] <= key)
                left = mid + 1;
            else 
                right = mid;
        }
        return left;
    }
}

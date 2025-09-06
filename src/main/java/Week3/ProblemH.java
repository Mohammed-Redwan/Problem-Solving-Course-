// Temporarily unavailable Problem
package Week3;

import java.util.*;

public class ProblemH {
    public static void solve() {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int r = input.nextInt();
            
            Interval travelInterval = new Interval(a,b);
            Interval covarageInterval = new Interval(c - r, c + r);
            
            Interval intersectionInterval = travelInterval.getIntersection(covarageInterval);            
            int result = travelInterval.getLength() - intersectionInterval.getLength();
            System.out.println(result);

        }
    }
    public static class Interval
    {
        public int start;
        public int end;
        
        public Interval(int a, int b)
        {
            this.start = Math.min(a,b);
            this.end = Math.max(a, b);
        }
        public Interval getIntersection(Interval other)
        {
            int start = Math.max(other.start, this.start);
            int end = Math.min(other.end, this.end);
            if (start > end) return new Interval(0,0);
                
            
            return new Interval(start, end);
        }
        public int getLength()
        {
            return end - start;
        }
    }
}


// package DYNAMIC-PROGRAMMING.DAY-2.FROG JUMP.MEMOIZATION;

import java.util.* ;
import java.math.*;

public class space{
    public static int solve(int idx , int[] heights) {
        if(idx==0) return 0 ;
        int prev2 = 0 , prev1 = 0;
        for(int i=1 ; i<heights.length ; i++) {
                int left = solve(i-1, heights) + Math.abs(heights[i] - heights[i-1]) ;
                int right = Integer.MAX_VALUE;
                if(idx>1) {
                    right = solve(i-2 , heights) + Math.abs(heights[i] - heights[i-2]) ;
                }
                int curr = Math.min(left , right) ;
                prev2 = prev1 ;
                prev1 = curr ;
                }
                return prev1 ;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of steps: ");
        int n = sc.nextInt();
        
        int[] heights = new int[n];
        System.out.println("Enter the heights of the steps:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        
        
        int result = solve(n - 1, heights);
        System.out.println("Minimum energy required: " + result);
        
        sc.close();
    }
    
}

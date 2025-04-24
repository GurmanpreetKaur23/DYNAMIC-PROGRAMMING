
// package DYNAMIC-PROGRAMMING.DAY-2.FROG JUMP.MEMOIZATION;

import java.util.* ;
import java.math.*;

public class tabu{
    public static int solve(int idx , int[] heights , int[] dp) {
        if(idx==0) return 0 ;
        if(dp[idx]!=-1) return dp[idx] ;
        dp[0] = 0 ;
        for(int i=1 ; i<heights.length ; i++) {
            int left = solve(i-1, heights , dp) + Math.abs(heights[i] - heights[i-1]) ;
        int right = Integer.MAX_VALUE;
        if(i>1) {
            right = solve(i-2 , heights , dp) + Math.abs(heights[i] - heights[i-2]) ;
        }
        dp[i] = Math.min(left , right) ;
        }
        return dp[heights.length-1];
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
        
        int[] dp = new int[n];
        Arrays.fill(dp, -1); // Initialize DP array with -1
        
        int result = solve(n - 1, heights , dp);
        System.out.println("Minimum energy required: " + result);
        
        sc.close();
    }
    
}

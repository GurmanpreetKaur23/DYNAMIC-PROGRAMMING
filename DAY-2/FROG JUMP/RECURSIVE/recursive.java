
// package DYNAMIC-PROGRAMMING.DAY-2.FROG JUMP.MEMOIZATION;

import java.util.* ;
import java.math.*;

public class recursive {
    public static int solve(int i , int[] heights) {
        if(i==0) return 0 ;

        int left = solve(i-1, heights) + Math.abs(heights[i] - heights[i-1]) ;
        int right = Integer.MAX_VALUE;
        if(i>1) {
            right = solve(i-2 , heights) + Math.abs(heights[i] - heights[i-2]) ;
        }
        return Math.min(left , right) ;
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

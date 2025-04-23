// package DYNAMIC-PROGRAMMING.DAY-1.FIBONACCI.memoization;
import java.util.* ;
// 0 1 1 2 3 5 ... 
// store values in dp array
public class memoization {
    public static int fib(int n, int[] dp) {
        if(n<=1) return n ;
        if(dp[n]!=-1) return dp[n] ;

        dp[n] = fib(n-1 , dp) + fib(n-2 , dp) ;
        return dp[n] ;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : "); 
        int n = sc.nextInt() ;

        int[] dp = new int[n+1] ;
        Arrays.fill(dp , -1) ;
        int res = fib(n, dp) ;
        System.out.println(res);

        sc.close() ;
    }
}
// time complexity : O(n) 
// space complexity : O(n) 
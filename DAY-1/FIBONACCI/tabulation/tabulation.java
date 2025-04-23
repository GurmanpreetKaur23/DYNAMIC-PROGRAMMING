// package DYNAMIC-PROGRAMMING.DAY-1.FIBONACCI.tabulation;
import java.util.* ;

// 0 1 1 2 3 ...

// fill the dp table iteratively from the base case
public class tabulation {
    public static int fib(int n , int[] dp) {
        if(n<=1) return n ;
        dp[0] = 0 ; // base case 
        dp[1] = 1 ; // base case

        for(int i=2 ; i<=n ; i++) {
            dp[i] = dp[i-1] + dp[i-2] ;
        }

        return dp[n] ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter n : ");
        int n = sc.nextInt() ;
        int[] dp = new int[n+1] ;
        int res = fib(n , dp) ;
        System.out.println(res);

        sc.close() ;
    }
}
// time complexity : O(n)
// space complexity : O(n)
// package DYNAMIC-PROGRAMMING.DAY-1.CLIMBING STAIRS-70.tabulation;
import java.util.* ;
public class tabulation {
    public static int ways(int n , int[] dp) {
        if(n==0 || n==1) return 1 ;
        dp[0] = 1 ;
        dp[1] = 1 ;

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
        int res = ways(n , dp) ;
        System.out.println(res);
        sc.close() ;
    }
}
// tc & sc : o(n)

// package DYNAMIC-PROGRAMMING.DAY-1.CLIMBING STAIRS-70.memoization;
import java.util.* ;
public class memoization {
    public static int ways(int n , int[] dp) {
        if(n==0 || n==1) return 1 ;
        if(dp[n]!=-1) return dp[n] ;

        dp[n] = ways(n-1 , dp) + ways(n-2 , dp) ;
        return dp[n] ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter n : ");
        int n = sc.nextInt() ;
        int[] dp = new int[n+1] ;
        Arrays.fill(dp , -1) ;
        int res = ways(n , dp) ;
        System.out.println(res);
        sc.close() ;
    }
}
// tc & sc - o(n)

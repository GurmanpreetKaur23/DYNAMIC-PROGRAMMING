// package DYNAMIC-PROGRAMMING.DAY-1.CLIMBING STAIRS-70.recursive;
import java.util.* ;
public class recursive {
    public static int ways(int n) {
        if(n==0 || n==1) return 1 ;
        return ways(n-1)+ways(n-2) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter n : ");
        int n = sc.nextInt() ;

        System.out.println(ways(n));
        sc.close() ;
    }
}

// tc - o(n)
// sc - o(n)
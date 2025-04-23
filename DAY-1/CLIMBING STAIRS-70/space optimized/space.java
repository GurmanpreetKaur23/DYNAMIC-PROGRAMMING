// package DYNAMIC-PROGRAMMING.DAY-1.CLIMBING STAIRS-70.space optimized;
import java.util.* ;
public class space {
    public static int ways(int n) {
        if(n==0 || n==1) return 1; 

        int prev1 = 1 , prev2 =1 , curr =0;
        for(int i=2 ; i<=n ; i++) {
            curr = prev1 + prev2  ;
            prev2 = prev1 ;
            prev1 = curr ;
        }
        return curr ;

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
// sc - o(1)
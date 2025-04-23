// package DYNAMIC-PROGRAMMING.DAY-1.FIBONACCI.space optimized;
import java.util.* ;

// 0 1 1 2 3 .. 
// keeping the last two values
public class space {
    
    public static int fib(int n) {
        if(n<=1) return n ;
        int prev1 = 1 , prev2 = 0 , curr =0 ;

        for(int i=2 ; i<=n ; i++) {
            curr = prev1 + prev2 ;
            prev2 = prev1 ;
            prev1 = curr ;
        }
        return curr ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter n : ");
        int n = sc.nextInt() ;
        
        System.out.println(fib(n));

        sc.close() ;
    }
}

// time complexity : O(n) 
// space complexity : O(1)
import java.util.* ;

// 0 1 1 2 3 ....
public class recursive {
    public static int fib(int n) {
        if(n<=1) return n ;
    
        return fib(n-1) + fib(n-2) ;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter n: ");
        int n = sc.nextInt(); 


        System.out.println(fib(n));
        sc.close() ;
    }
}
// TIME COMPLEXITY - O(2^n) very slow
// SPACE COMPLEXITY - O(n)


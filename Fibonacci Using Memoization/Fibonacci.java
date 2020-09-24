import java.util.Scanner;

class Fibonacci{

    // The Fibonacci numbers are the numbers in the following integer sequence.
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

    // In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation

    //     Fn = Fn-1 + Fn-2
    //     with seed values

    //     F0 = 0 and F1 = 1.

    
    // Recursion – Solve the sub-problems recursively
    
            // Time Complexity:
            // T(n) = T(n-1) + T(n-2) + 1 = 2n = O(2n)
            
            // Memoization – Store the solution of these sub-problems so that we do not have to solve them again
            
            // Time Complexity: O(n) 
            // Space Complexity : O(n)
            
    // here qb(array) is a question bank which hold all the previous answer which is already solved

    public static int FibMomoized(int n , int[] qb){
        if( n == 0 || n == 1){
            return n;
        }
        if(qb[n] != 0){
            return qb[n];
        }

        int fibn1 = FibMomoized(n-1, qb);
        int fibn2 = FibMomoized(n-2, qb);
        int resultFib = fibn1 + fibn2;
        return resultFib;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = FibMomoized(n , new int[n+1]);
        System.out.println(fib);
    }
}
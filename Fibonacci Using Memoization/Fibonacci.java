class Fibonacci{
    public static int FibMomoized(int n , int[] qb){
        return n;
    }
    public static void main(String[] args) {
        int n = 5;
        int fib = FibMomoized(n , new int[n+1]);
        System.out.println(fib);
    }
}
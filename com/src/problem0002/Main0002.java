package problem0002;

// https://projecteuler.net/problem=2
public class Main0002 {

    public static void main(String[] args) {
        System.out.println(sumOfEvenFibonacci(4000000));
    }


    private static int sumOfEvenFibonacci(int n) {
        int a = 1;
        int b = 2;
        int acc = 0;
        while(b < n) {
            if(b%2 == 0) {
                acc += b;
            }
            b += a;
            a = b-a;
        }
        return acc;
    }
}



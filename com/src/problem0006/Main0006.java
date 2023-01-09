package problem0006;


/**
 * Find the difference between
 * the sum of the squares of the first one hundred natural numbers and
 * the square of the sum.
 */
public class Main0006 {

    public static void main(String[] args) {
        System.out.println(sumOfSquares(100) - squaresOfSum(100));
    }

    public static int sumOfSquares(int n) {
        int k = 0;
        while(n > 1) {
            k += n*n;
            n--;
        }
        return k+1;
    }

    public static int squaresOfSum(int n) {
        return n*(n+1)/2 * n*(n+1)/2;
    }
}

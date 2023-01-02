package problem0004;


import java.util.ArrayList;
import java.util.List;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Main0004 {

    public static void main(String[] args) {

    }

    public static int findLargestPalindrome(int numberOfDigits) {
        int x = (int) Math.pow(10, numberOfDigits-1) -1;
        int min = (x+1)/10;
        int max = x * x;
        List<Integer> palindromes = new ArrayList<Integer>();
        for(int i = x ; i > min; i--) {
            int k;
            for(int j = i; j > min; j--) {
                if(isPalindrome((k = i*j))) {
                    palindromes.add(k);
                }
            }
        }
        return palindromes.stream().max(Integer::max).get();
    }

    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}

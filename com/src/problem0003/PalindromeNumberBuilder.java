package problem0003;

public class PalindromeNumberBuilder {

    int digits;
    int value;
    int factorA;
    int factorB;



    public PalindromeNumberBuilder(int n) {
        digits = n;
    }

    public void findMaxPalindrome() {
        for(int i = minNumber(); i < maxNumber(); i++) {
            int k;
            for(int j = i; j < maxNumber(); j++) {
                k = i*j;
                if(isPalindrome(String.valueOf(k)) && k > value) {
                    value = k;
                    factorA = i;
                    factorB = j;
                }
            }
        }
    }

    public static boolean isPalindrome(String s) {
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public int getValue() {
        return value;
    }

    public int maxNumber() {
        return (int) Math.pow(10, digits);
    }

    public int minNumber() {
        return (int) Math.pow(10, digits-1);
    }
}

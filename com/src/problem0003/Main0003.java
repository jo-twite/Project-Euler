package problem0003;

public class Main0003 {

    public static void main(String[] args) {
        PalindromeNumberBuilder palindrome = new PalindromeNumberBuilder(3);
        palindrome.findMaxPalindrome();
        System.out.println(palindrome.getValue());
        System.out.println("{" + palindrome.factorA + ", " + palindrome.factorB + "}");
    }
}

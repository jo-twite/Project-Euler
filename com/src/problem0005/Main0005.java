package problem0005;


/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20
 * 20 * 19 * 18 * 17 * 16 * 15 * 14 * 13 * 12 * 11
 * Answer is 232.792.560 and was found manually
 */
public class Main0005 {

    public static void main(String[] args) {

        DivisibleNumber divisibleNumber = new DivisibleNumber(20);
        System.out.println(divisibleNumber.getDivisors().toString());
        System.out.println(divisibleNumber.getK());
    }
}

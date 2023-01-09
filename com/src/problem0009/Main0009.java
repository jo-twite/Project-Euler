package problem0009;


/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * SOLUTION:
 *
 *  a + b + c = 1000
 *  c = 1000 - a - b
 *  c^2 = (1000 - a - b)^2 = a^2 + b^2
 *
 *   Then I have to find a and b such as:
 *    a^2 + b^2 = (1000 - a - b)^2
 *
 */
public class Main0009 {

    public static void main(String[] args) {
        for(int b = 1; b < 1000; b++) {
            for(int a = 1; a < b; a++) {
                int cSquared_1 = a*a + b*b;
                int c = (int) Math.sqrt(cSquared_1);
                int cSquared_2 = (1000 - a - b) * (1000 - a - b);
                if(cSquared_1 == cSquared_2 && a < b && b < c) {
                    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    System.out.println(a * b * c);
                }
            }
        }
        //System.out.println("End");
    }
}

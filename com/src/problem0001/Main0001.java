package problem0001;


// https://projecteuler.net/problem=1

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main0001 {


    public static void main(String[] args) {
        System.out.println(multiplesOfThreeAndFive(1000));
    }

    private static int multiplesOfThreeAndFive(int n) {
        Function<Integer, Integer> sumOfMultiplesOf = (m) -> m * (n/m) * ((n/m) +1)/2;
        int sumOfmultiplesOfThree = sumOfMultiplesOf.apply(3);
        int sumOfmultiplesOfFive = sumOfMultiplesOf.apply(5);
        int sumOfmultiplesOfFifteen = sumOfMultiplesOf.apply(15);
        if(n%5 == 0 || n%3 == 0) {
            sumOfmultiplesOfFifteen += n;
        }
        return sumOfmultiplesOfThree + sumOfmultiplesOfFive - sumOfmultiplesOfFifteen;
    }
}

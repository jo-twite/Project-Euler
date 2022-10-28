package problem0001;


// https://projecteuler.net/problem=1

public class Main0001 {


    public static void main(String[] args) {
        System.out.println(multiplesOfThreeAndFive(1000));
    }

    private static int multiplesOfThreeAndFive(int n) {
        int multiplesOfThree = n/3;
        int multiplesOfFive = n/5;
        int multiplesOfFifteen = n/15;

        int sumOfmultiplesOfThree = multiplesOfThree*(multiplesOfThree + 1)/2 * 3;
        int sumOfmultiplesOfFive = multiplesOfFive*(multiplesOfFive + 1)/2 * 5;
        int sumOfmultiplesOfFifteen = multiplesOfFifteen*(multiplesOfFifteen + 1)/2 * 15;

        if(n%5 == 0 || n%3 == 0) {
            sumOfmultiplesOfFifteen += n;
        }
        return sumOfmultiplesOfThree + sumOfmultiplesOfFive - sumOfmultiplesOfFifteen;
    }
}

package problem0005;

import java.util.ArrayList;
import java.util.List;

public class DivisibleNumber {

    private List<Integer> divisors = new ArrayList<Integer>();
    int k;

    public DivisibleNumber(int n) {
        int k = 2;
        for(int i = 2; i >= n; i++) {
            if(k % i != 0) {
                k *= i;
                divisors.add(i);
                for(int j = 0; j < divisors.size(); j++) {
                    if(i % divisors.get(j) == 0) {
                        divisors.remove(j);
                    }
                }
            }
        }
    }

    public List<Integer> getDivisors() {
        return divisors;
    }

    private List<Integer> findDivisors(int n) {
        List<Integer> nDivisors = new ArrayList<Integer>();
        for(int i = 2 ; i < n/2; i++) {
            if(n%i == 0) {
                nDivisors.add(i);
            }
        }
        return nDivisors;
    }

    public int getK() {
        return k;
    }

}

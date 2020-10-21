package leetcode.easy;

/*
    @author collin kleest
    @problem count primes 204
    @link https://leetcode.com/problems/count-primes/
 */

public class E204 {

    public static int countPrimes(int n){
        int primes = 0;

        boolean[] nonPrimes = new boolean[n];

        for (int i = 2; i < n; i++){
            if (nonPrimes[i]){continue;}
            primes++;
            for (int j = 2; i*j < n; j++){
                nonPrimes[i*j] = true;
            }
        }

        return primes;
    }

}

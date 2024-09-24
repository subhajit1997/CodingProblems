package com.code.java.company.WissenTech;

import java.util.ArrayList;
import java.util.List;

/**
 * https://takeuforward.org/data-structure/sieve-of-eratosthenes-find-all-prime-numbers
 */
public class SieveofEratosthenesFindallPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(findAllPrime(10).toString());
    }

    //approach -1 Brute force
    //time - O(N*(sqrt(N)))
    public static List<Integer> findAllPrime(int n){
        List<Integer> ans =  new ArrayList<>();
        for (int i=2;i<=n;i++){
            if(isPrime(i))
                ans.add(i);
        }
        return ans;
    }
    public static boolean isPrime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}

package com.company;

import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        // TODO: Calculate the prime factors of a number and display them.
        findPrimeFactors(inputNumber);

    }
    public static void findPrimeFactors(int num){
        boolean isPrime =  true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                findPrimeFactors(num/i);
            }
        }
        if (isPrime) {
                System.out.println(num);
            };
    }
}

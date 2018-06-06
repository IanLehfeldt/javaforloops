package com.ianl;

public class Main {
    public static int primeNumbers = 0;

    public static void main(String[] args) {

//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 @ " + i + "% interest rate = " + String.format("%.2f",calculateInterest(10000.0, i)));
//        }
//
//        System.out.println("*********************");
//
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10,000 @ " + i + "% interest rate = " + String.format("%.2f",calculateInterest(10000.0, i)));
//        }
        // Create a for statement using any range of numbers
        // Determine if number is prime using the is prime method
        // if prime, print number and increment count of number of prime numbers found
        // if the count is 3, break the loop
        // use break; to exit loop

        for (int i = 20; i < 33; i++) {
            if (primeNumbers == 3) {
                System.out.println("Found 3 Prime numbers, breaking loop");
                primeNumbers = 0;
                break;
            }
            if(isPrime(i)) {
                System.out.println(i+" is a Prime number");
                primeNumbers++;
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n != 1) {
            for (int i = 2; i <= n/2; i++) {
                if ( n % i == 0 ) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    //basic for statement = for(initialize; termination; increment){ do the thing };
}


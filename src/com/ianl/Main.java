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

        for (int i = 1; i < 99; i++) {
            if(isPrime(i)) {
                System.out.println(i+" is a Prime number");
                primeNumbers++;
                if (primeNumbers == 10) {
                    System.out.println("Found " + primeNumbers + " Prime numbers, breaking loop");
                    primeNumbers = 0;
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        //if number isn't 1 then..
        if (n != 1) {
            //for loop that checks if there are any numbers less than half of the par that can
            //divide into the par and return a 0 value
            for (int i = 2; i <= (long) Math.sqrt(n); i++) {
                if ( n % i == 0 ) {
                    //if there's a divisible number then method returns false
                    return false;
                }
            }
            //else, return true
            return true;
        }
        return false;
    }
    //basic for statement = for(initialize; termination; increment){ do the thing };
}


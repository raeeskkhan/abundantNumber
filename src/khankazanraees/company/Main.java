package khankazanraees.company;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> divisors = new ArrayList<>();

    public static void main(String[] args) {

//        A number n is said to be Abundant Number if sum of all the proper divisors of the number denoted by sum(n)
//        is greater than the value of the number n. And the difference between these two values is called
//        the abundance.

        //Add 0 as the first index
        divisors.add(0);

        //Input Number
        int inputNumber = 12;
        //Divide by 2 since a divisor cannot be greater than half the input number
        int halfInputNumber = Math.round(Math.floorDiv(inputNumber, 2));
        getDivisors(halfInputNumber, inputNumber);

        //Remove the first index
        divisors.remove(0);
        //Print Divisors to Screen
        displayDivisors();

        //Is the number abundant?
        isAbundant(inputNumber);

    }

    public static void getDivisors(int halfInputNumber, int inputNumber) {

        for (int i = 1; i <= halfInputNumber; i++) {
            if (inputNumber % i == 0) {
                divisors.add(i);
            }
        }
        System.out.println();

    }

    public static void displayDivisors() {
        System.out.print("Divisors: ");
        for (Integer divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }

    public static int addAllDivisors() {
        int totalSum = 0;

        for (Integer divisor : divisors) {
            totalSum += divisor;
        }
        System.out.println("\nTotal Sum: " + totalSum);
        return totalSum;
    }

    public static void isAbundant(int inputNumber) {

        int totalSum = addAllDivisors();
        if (totalSum > inputNumber) {
            System.out.println(inputNumber + " is an Abundant Number since " + inputNumber + " < " + totalSum);
        } else {
            System.out.println(inputNumber + " is NOT an Abundant Number since " + inputNumber + " > " + totalSum);
        }

    }

}

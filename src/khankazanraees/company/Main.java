package khankazanraees.company;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> divisors = new ArrayList<>();

    public static void main(String[] args) {

        //Add 0 as the first index
        divisors.add(0);

        //Input Number
        int num = 21;
        //Divide by 2 since a divisor cannot be greater than half the input number
        int temp = Math.round(num / 2);
        getDivisors(temp, num);

        //Remove the first index
        divisors.remove(0);
        //Print Divisors to Screen
        displayDivisors();

        //Is the number abundant?
        isAbundant(num);

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
        for (int i = 0; i < divisors.size(); i++) {
            System.out.print(divisors.get(i) + " ");
        }
    }

    public static int addAllDivisors() {
        int totalSum = 0;

        for (int i = 0; i < divisors.size(); i++) {
            totalSum += divisors.get(i);
        }
        System.out.println("\nTotal Sum: " + totalSum);
        return totalSum;
    }

    public static void isAbundant(int inputNumber) {

        int totalSum = addAllDivisors();
        if (totalSum > inputNumber) {
            System.out.println(inputNumber + " is an Abundant Number");
        } else {
            System.out.println(inputNumber + " is NOT an Abundant Number");
        }

    }

}

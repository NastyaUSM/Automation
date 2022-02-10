package lesson1;

import java.util.Scanner;

public class Nomer2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a three-digit integer: ");
        number = scanner.nextInt();

        if (number > 999 || number < 100){
            System.out.println("Error! Number is not a three-digit number!");
        } else {
            int firstNumber = number / 100;
            int lastNumber = number % 10;

            if (firstNumber == lastNumber){
                System.out.println(number + " is a palindrome!");
            } else {
                System.out.println(number + " is not a palindrome!");
            }
        }
    }
}

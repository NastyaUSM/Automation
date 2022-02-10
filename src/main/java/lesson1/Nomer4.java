package lesson1;

import java.util.Scanner;

public class Nomer4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println(number + " is a palindrome!");
        } else {
            System.out.println(number + " is not a palindrome!");
        }
    }

    public static int reverse(int number){
        String numberAsString = number + "";
        String reversedNumberAsString = "";
        for (int i = numberAsString.length() - 1; i >= 0; i--){
            reversedNumberAsString += numberAsString.charAt(i);
        }

        return Integer.parseInt(reversedNumberAsString);
    }

    public static boolean isPalindrome(int number){
        int reversedNumber = reverse(number);
        return reversedNumber == number;
    }
}

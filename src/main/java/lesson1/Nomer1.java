package lesson1;

import java.util.Scanner;

public class Nomer1 {

    public static void main(String[] args) {
        double celsius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}

package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //square
        System.out.println("Please, enter your number: ");
        int num = scanner.nextInt();
        square(num);

        // volume
        System.out.println("Enter your radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();
        double volume = circle(radius, height);
        System.out.println("Volume is: " + volume);

        //array
        System.out.println("Enter the number of array elements: ");
        int numElements = scanner.nextInt();
        int[] array = new int[numElements];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < numElements; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = sumArray(array);
        System.out.println("The sum of array is: " + sum);

        // row in reverse
        scanner.nextLine();
        System.out.println("Enter a string: ");
        String newString = scanner.nextLine();
        String reverseString = reverse(newString);
        System.out.println("Row in reverse order: " + reverseString);

        // power
        System.out.println("Enter  your number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter your number b: ");
        int b = scanner.nextInt();
        int result = power(a, b);
        System.out.println("Result " + a + " ^ " + b + " is: " + result);

        //enter text
        System.out.println("Enter integer: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter text string:  ");
        String text = scanner.nextLine();
        enterText(n, text);
        }

    public static void square( int num) {
        int enterNum = num * num;
        System.out.println("Square is: " + enterNum);
    }
    public static double circle (double radius, double height) {
        return radius * radius * Math.PI * height;
    }
    public static int sumArray (int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    public static String reverse (String inputString){
        return new StringBuilder(inputString).reverse().toString();
    }
    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }
    public static void enterText (int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}

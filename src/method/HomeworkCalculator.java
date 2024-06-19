package method;

import java.util.Scanner;

public class HomeworkCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the first number or type 'exit' to quit:");
            if (scanner.hasNext("exit")) {
                System.out.println("Exiting...");
                break;
            }
            double a = 0;
            double b = 0;
            String c = "";


            a = Double.parseDouble(scanner.nextLine());
            c = scanner.nextLine();
            b = Double.parseDouble(scanner.nextLine());

            switch (c) {
                case "+":
                    System.out.println("The result is" + "\t" + add(a, b));
                    break;
                case "-":
                    System.out.println("The result is" + "\t" + subtraction(a, b));
                    break;
                case "*":
                    System.out.println("The result is" + "\t" + multiplication(a, b));
                    break;
                case "/":
                    if (b != 0) {
                        System.out.println("The result is" + "\t" + division(a, b));
                    } else {
                        System.out.println("b = 0, error!");
                    }
                    break;
                default:
                    System.out.println("Error!");
            }
            scanner.nextLine();
        }
        scanner.close();



    }
    public static double add (double a , double b){
        return a+b;
    }
    public static double subtraction (double a , double b){
        return a-b;
    }
    public static double multiplication (double a , double b){
        return a*b;
    }
    public static double division (double a , double b){
        return a/b;
    }
}

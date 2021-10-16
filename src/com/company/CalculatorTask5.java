package com.company;

import java.util.Scanner;

public class CalculatorTask5 {

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            double num1 = getDouble();
            double num2 = getDouble();
            char operation = getOperation();
            double result = calc(num1,num2,operation);
            System.out.println("Result: " + result);
        }

        public static double getDouble(){
            System.out.println("Input the number: ");
            double num;
            if(scanner.hasNextDouble()){
                num = scanner.nextDouble();
            } else {
                System.out.println("Input the correct data.");
                scanner.next();
                num = getDouble();
            }
            return num;
        }

        public static char getOperation(){
            System.out.println("Input operation: ");
            char operation;

            if(scanner.hasNext()){
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Input the correct operation.");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }

        public static double calc(double num1, double num2, char operation){
            double result = 0.0;
            switch (operation){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0.0) {
                        return Integer.parseInt(("Impossible operation."));
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Something went wrong...");
                    result = calc(num1, num2, getOperation());
            }
            return result;
        }

}

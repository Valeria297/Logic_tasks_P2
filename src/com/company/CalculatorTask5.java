package com.company;

import java.util.Scanner;

public class CalculatorTask5 {

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1,num2,operation);
            System.out.println("Result: " + result);
        }

        public static int getInt(){
            System.out.println("Input the number: ");
            int num;
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
            } else {
                System.out.println("Input the correct data.");
                scanner.next();
                num = getInt();
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

        public static int calc(int num1, int num2, char operation){
            int result = 0;
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
                    if (num2 == 0) {
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

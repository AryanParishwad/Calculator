package com.Aryan;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from user till user does not press X or x

        while (true) {
            //take the operator as input
            System.out.println("Menu:");
            System.out.println("1. +\n2. -\n3. *\n4. /\n5. %");
            System.out.print("Input operation to be performed: (Press x to exit)");
            char op = in.next().trim().charAt(0);
            int ans = 0;
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //input two numbers
                System.out.println("Input two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println("The answer is: "+ans);

        }
    }
}

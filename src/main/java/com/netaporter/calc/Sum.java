package com.netaporter.calc;

/**
 * Created by v.copeman on 04/08/2016.
 */

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Calculator math = new Calculator();

        Scanner userinput = new Scanner(System.in);

            System.out.println("Welcome to Java Calculator");

            System.out.println("===========================");


            System.out.print("Enter First Number:");

            int num1 = userinput.nextInt();

            System.out.print("Enter operation to perform (+,-,x,/):");

            String operation= userinput.next();

            System.out.print("Enter Second Number:");

            int num2= userinput.nextInt();


            if (operation.equals("+"))

                System.out.println(math.Add(num1, num2));

            else if (operation.equals("-"))

                System.out.println(math.Subtract(num1, num2));

            else if (operation.equals("x"))

                System.out.println(math.Multiply(num1, num2));

            else if (operation.equals("/"))

                System.out.println(math.Divide(num1, num2));

            else

                System.out.println("The operation is not valid.");
        }
}

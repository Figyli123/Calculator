package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){

            System.out.println("--------------------");
            System.out.println("Enter first number: ");
            System.out.println("--------------------");

            String first = new Scanner(System.in).nextLine();

            System.out.println("--------------------");
            System.out.println("Enter operator: ");
            System.out.println("--------------------");

            String operator = new Scanner(System.in).nextLine();

            System.out.println("--------------------");
            System.out.println("Enter second number: ");
            System.out.println("--------------------");

            String second = new Scanner(System.in).nextLine();

            switch (operator){
                case "+":
                    var i1 = Double.valueOf(first) + Double.valueOf(second);

                    System.out.println("--------------------");
                    System.out.println("Your answer +: " + i1);
                    System.out.println("--------------------");
                    break;

                case "-":
                    var i2 = Double.valueOf(first) - Double.valueOf(second);

                    System.out.println("--------------------");
                    System.out.println("Your answer -: " + i2);
                    System.out.println("--------------------");
                    break;

                case "*":
                    var i3 = Double.valueOf(first) * Double.valueOf(second);

                    System.out.println("--------------------");
                    System.out.println("Your answer *: " + i3);
                    System.out.println("--------------------");
                    break;

                case "/":
                    var i4 = Double.valueOf(first) / Double.valueOf(second);

                    System.out.println("--------------------");
                    System.out.println("Your answer /: " + i4);
                    System.out.println("--------------------");
                    break;

                default:

                    System.out.println("--------------------");
                    System.out.println("Unknown operator, please try again");
                    System.out.println("--------------------");
                    break;
            }



        }

    }
}
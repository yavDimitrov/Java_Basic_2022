<<<<<<< HEAD
package Lesson_02_ConditionalStatement;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String form = scanner.nextLine();

            if( form.equals("square")) {
                double num1 = Double.parseDouble(scanner.nextLine());
                double area = num1*num1;

                System.out.printf("%.3f",area);

            }   else if( form.equals("rectangle")) {
                double num1 = Double.parseDouble(scanner.nextLine());
                double num2 = Double.parseDouble(scanner.nextLine());
                double area = num1*num2;

                System.out.printf("%.3f",area);

            } else if( form.equals("circle")) {
                double num1 = Double.parseDouble(scanner.nextLine());
                double area = num1*num1*Math.PI;

                System.out.printf("%.3f",area);

            } else if( form.equals("triangle")) {
                double num1 = Double.parseDouble(scanner.nextLine());
                double num2 = Double.parseDouble(scanner.nextLine());
                double area = num1*num2/2;

                System.out.printf("%.3f",area);

            } else {
                System.out.println("Unknown form");
            }
        }
    }

=======
package Lesson_02_ConditionalStatement;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String form = scanner.nextLine();

            if( form.equals("square")) {
                double num1 = Double.parseDouble(scanner.nextLine());
                double area = num1*num1;

                System.out.printf("%.3f",area);

            }   else if( form.equals("rectangle")) {
                double num1 = Double.parseDouble(scanner.nextLine());
                double num2 = Double.parseDouble(scanner.nextLine());
                double area = num1*num2;

                System.out.printf("%.3f",area);

            } else if( form.equals("circle")) {
                double num1 = Double.parseDouble(scanner.nextLine());
                double area = num1*num1*Math.PI;

                System.out.printf("%.3f",area);

            } else if( form.equals("triangle")) {
                double num1 = Double.parseDouble(scanner.nextLine());
                double num2 = Double.parseDouble(scanner.nextLine());
                double area = num1*num2/2;

                System.out.printf("%.3f",area);

            } else {
                System.out.println("Unknown form");
            }
        }
    }

>>>>>>> f4f38080b57f0b473462d6a3d4a104f6cf6d0bfa

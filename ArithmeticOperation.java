package coding;

import java.util.Scanner;

public class ArithmeticOperation {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first number:");
	        int num1 = scanner.nextInt();

	        System.out.println("Enter the second number:");
	        int num2 = scanner.nextInt();

	        System.out.println("Enter the operation (+, -,*,/):");
	        char op = scanner.next().charAt(0);

	        int result = 0;

	        switch (op) {
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
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operation");
	                return;
	        }

	        System.out.println("The result is: " + result);
	    }
	}




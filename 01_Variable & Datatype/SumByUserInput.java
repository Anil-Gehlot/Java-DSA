

import java.util.*;

public class SumByUserInput{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first integer number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter second integer number: ");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("Sum of both number is: " + sum);
	}

}



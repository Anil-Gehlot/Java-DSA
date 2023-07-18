


import java.util.Scanner;


public class _02Parameter{
	// parameter in function
	public static int Sum(int num1, int num2){
		int total = num1 + num2;
		return total;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();


		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();

		// argument while calling the function..
		int sum = Sum(num1, num2);
		System.out.println("Sum: " + sum);

	}
}
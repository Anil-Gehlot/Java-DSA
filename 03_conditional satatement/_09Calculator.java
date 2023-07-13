

import java.util.Scanner;

public class _09Calculator{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		float num1 = sc.nextFloat();

		System.out.println("Enter second number: ");
		float num2 = sc.nextFloat();

		System.out.println("Enter operator: ");
		char op = sc.next().charAt(0);

		switch (op){
		case '+' : System.out.println("your ans is: "+ (num1+num2));
			break;

		case '-' : System.out.println("your ans is: "+ (num1-num2));
			break;

		case '*' : System.out.println("your ans is: "+ (num1*num2));
			break;

		case '/' : System.out.println("your ans is: "+ (num1/num2));
			break;

		case '%' : System.out.println("your ans is: "+ (num1%num2));
			break;
		default : System.out.println("Please enter a valid operator......");
		}
	}
}
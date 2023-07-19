



// Write a Java method to compute the average of three numbers....



import java.util.Scanner;

public class _14Question1{

	public static float sum(float num1, float num2, float num3){
		return num1+num2+num3;
	}



	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		float num1 = sc.nextFloat();

		System.out.print("Enter second number: ");
		float num2 = sc.nextFloat();

		System.out.print("Enter third number: ");
		float num3 = sc.nextFloat();

		float total = sum(num1, num2, num3);
		System.out.println("Total sum: " + total);
	}
}
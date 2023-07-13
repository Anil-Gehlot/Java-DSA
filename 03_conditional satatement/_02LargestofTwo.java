

import java.util.Scanner;


public class _02LargestofTwo{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);


		System.out.print("Enter First number: ");
		float num1 = sc.nextFloat();

		System.out.print("Enter Second number: ");
		float num2 = sc.nextFloat();

		if (num1>num2){
			System.out.println("First number is largest");
		}
		else{
			System.out.println("Second number is largest");
		}
	}

}
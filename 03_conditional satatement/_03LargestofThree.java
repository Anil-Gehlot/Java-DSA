






import java.util.Scanner;


public class _03LargestofThree{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);


		System.out.print("Enter First number: ");
		float num1 = sc.nextFloat();

		System.out.print("Enter Second number: ");
		float num2 = sc.nextFloat();

		System.out.print("Enter Third number: ");
		float num3 = sc.nextFloat();

		if (num1==num2 || num2==num3 || num1==num3){
			System.out.println("Numbers are same please provide different numbers.");
		}

		else if (num1>num2 && num1>num3){
			System.out.println("First number is largest");
		}
		else if (num2>num3){
			System.out.println("Second number is largest");
		}
		else{
			System.out.println("Third number is largest");
		}
	}

}
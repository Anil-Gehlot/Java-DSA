
import java.util.Scanner;

public class _01IfElse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter your age: ");
		float age =sc.nextFloat();

		if (age>=19){
			System.out.println("you are adult.");
		}
		else if (age<=18 && age >=13){
			System.out.println("you are teenager.");
		}
		else
		{
			System.out.println("You are a child.");
		}
	}
}
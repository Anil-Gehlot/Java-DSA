

import java.util.Scanner;

public class _07PassFail{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Percentage: ");
		float marks = sc.nextFloat();

		String rc = (marks>=33)? "Pass" : "Fail";
		System.out.println(rc);
	}
}
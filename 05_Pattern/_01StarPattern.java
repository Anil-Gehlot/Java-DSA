

import java.util.Scanner;

public class _01StarPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows for pattern: ");
		int num = sc.nextInt();



		/*
		// 1st way...

		for (int i = 1; i<=num;i++){
			System.out.println("*".repeat(i));
			
		}
		*/
		

		for (int i=1; i<=num; i++){
			for(int j=1; j<= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
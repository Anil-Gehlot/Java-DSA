

//	Printing number from 1 to n.

import java.util.Scanner;

public class _03Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your choice: ");
		int num = sc.nextInt();

		int count = 1;

		while(count <=num){
			System.out.println(count);
			count++;
		}
	}
}
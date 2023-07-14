

// Sum of first n natural numbers.

import java.util.Scanner;


public class _04Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your choice: ");
		int num = sc.nextInt();

		int count = 1;

		int total = 0;


		while(count<=num){
			total += count;
			count++;
		}
		System.out.println(total);
	}
}
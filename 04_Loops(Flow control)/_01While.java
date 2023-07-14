

import java.util.Scanner;

public class _01While{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter how many time: ");
		int repeat = sc.nextInt();


		int counter = 1;

		while (counter <= repeat){
			System.out.println(counter + " Hello world!!");
			// counter +=1;
			counter++;
		}
	}
}
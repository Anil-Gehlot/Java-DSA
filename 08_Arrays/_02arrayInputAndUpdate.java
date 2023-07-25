

//  input and update operation in arrays.....

import java.util.Scanner;

public class _02arrayInputAndUpdate{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int marks[] = new int[10];


		// Input operation in array
		marks[0] = sc.nextInt();
		marks[1] = sc.nextInt();
		marks[2] = sc.nextInt();

		System.out.println("physics: " + marks[0]);
		System.out.println("chemistry: " + marks[1]);
		System.out.println("maths: " + marks[2]);


		// updation in array
		marks[2]= 100;
		System.out.println("maths: " + marks[2]);


		marks[1]=marks[1]+1;
		System.out.println("chemistry: " + marks[1]);

	}
}
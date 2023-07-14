


// Printing Square Pattern....

import java.util.Scanner;

public class _06SquarePattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row or column number: ");
		int num = sc.nextInt();

		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){
				System.out.print(" * ");
			}
			System.out.println();

		}
	}
}
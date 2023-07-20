

//	inverted half pyramid with numbers.........

import java.util.Scanner;
public class _03Pattern{

	public static void invertedPyramid(int row){

		int sum = 0;

		// outer loop for printing rows...
		for(int i=1; i<=row; i++){

			// inner loop for printing columns...    
			// we can also take    n-i+1 at the place of   row-sum.
			for(int j=1; j<=row-sum; j++){
				System.out.print(j+" ");
				
			}

			// To change the line...
			System.out.println();
			sum++;
		}
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows: ");
		int row = sc.nextInt();

		invertedPyramid(row);

		


	}
}
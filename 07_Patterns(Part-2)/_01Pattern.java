
/*
print a hollow rectangle pattern....

hollow = empty

	* * * * *
	*       *
	*       *
	* * * * *

*/


import java.util.Scanner;

public class _01Pattern{

	public static void hollow_rectangle(int row, int col){

		// outer loop for printing rows....
		for(int i=1; i<=row; i++){

			// inner loop for printing columns...
			for(int j=1; j<=col; j++){


				// checking the cell is boundry cell or not.
				if(i==1 || i==row || j==1 || j==col){

					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}




	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter no. of rows: ");
		int row = sc.nextInt();

		System.out.print("Enter no. of columns: ");
		int col = sc.nextInt();

		hollow_rectangle(row, col);


	}
}
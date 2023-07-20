

// 	Inverted Roatated Half Pyramid.....


import java.util.Scanner;

public class _02Pattern{

	public static void halfPyramid(int row){

		// outer loop for rows...
		for(int i=1; i<=row; i++){


			// inner loop for printing Spaces...
			for(int j=1; j<=row-i; j++){
				System.out.print("  ");
			}

			// inner loop for printing Stars...
			for(int k=1; k<=i; k++){
				System.out.print(" *");
			}

			// for changing line...
			System.out.println();
		}
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows: ");
		int row = sc.nextInt();

		halfPyramid(row);


	}
}
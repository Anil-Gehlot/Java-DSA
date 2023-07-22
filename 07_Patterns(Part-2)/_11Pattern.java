

//  Number pyramid.........


import java.util.Scanner;

public class _11Pattern{

	public static void numberPyramid(int n){


		//	outer loop for rows....
		for(int i=1; i<=n; i++){

			//	inner loop for printing spaces...
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}


			//	inner loop for printing numbers....
			for(int j=1; j<=i; j++){
				System.out.print(i+" ");
			}

		//	to change the line...
		System.out.println();


		}
	}





	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter no. of rows: ");
		int num = sc.nextInt();

		numberPyramid(num);


	}
}
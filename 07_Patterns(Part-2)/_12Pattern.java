




//   Palindromic Pattern.........


import java.util.Scanner;

public class _12Pattern{

	public static void palindromicPattern(int n){


		//	outer loop for rows....
		for(int i=1; i<=n; i++){

			//	inner loop for printing spaces...
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}


			//	inner loop for printing numbers till 1....
			for(int j=i; j>=1; j--){
				System.out.print(j);
			}
			//	inner loop for printing numbers from 2 to till row number ....
			for(int j=2; j<=i; j++){
				System.out.print(j);
			}


		//	to change the line...
		System.out.println();


		}
	}





	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter no. of rows: ");
		int num = sc.nextInt();

		palindromicPattern(num);


	}
}
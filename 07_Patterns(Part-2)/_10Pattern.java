




//  Diamond Pattern...........


import java.util.Scanner;


public class _10Pattern{

	public static void Diamond_pattern(int n){

		// 1st half.....
		// outer loop for rows....
		for(int i=1; i<=n; i++){


			// inner loop for printing spaces..
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}

			//  inner loop for printing hollow starts..
			for(int j=1; j<=(2*i)-1; j++){

					System.out.print("*");
				
			}
			System.out.println();

		}


		// 2nd half.....
		// outer loop for rows....
		for(int i=n; i>=1; i--){


			// inner loop for printing spaces..
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}

			//  inner loop for printing hollow starts..
			for(int j=1; j<=(2*i)-1; j++){

					System.out.print("*");
				
			}
			System.out.println();

		}
	}



	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = sc.nextInt();

		Diamond_pattern(n);
	}
}
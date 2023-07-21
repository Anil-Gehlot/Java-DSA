

// Solid Rhombus


import java.util.Scanner;


public class _08Pattern{

	public static void Solid_Rhombus(int n){

		// outer loop for rows....
		for(int i=1; i<=n; i++){


			// inner loop for printing spaces..
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}

			// inner loop for printing *...
			for(int j=1; j<=n; j++){
				System.out.print("*");
			}

			//  to change the line...
			System.out.println();
		}
	}



	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = sc.nextInt();

		Solid_Rhombus(n);
	}
}
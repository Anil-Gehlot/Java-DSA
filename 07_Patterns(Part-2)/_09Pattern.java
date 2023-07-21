




import java.util.Scanner;


public class _09Pattern{

	public static void Hollow_Rhombus(int n){


		// outer loop for rows....
		for(int i=1; i<=n; i++){


			// inner loop for printing spaces..
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}

			//  inner loop for printing hollow starts..
			for(int j=1; j<=n; j++){

				if(i==1 || i==n || j==1 || j==n){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}



	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = sc.nextInt();

		Hollow_Rhombus(n);
	}
}
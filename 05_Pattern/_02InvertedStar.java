



import java.util.Scanner;

public class _02InvertedStar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows for pattern: ");
		int num = sc.nextInt();

		/*
		//  1 way 
		for(int i = num; i>=1; i-- ){
			System.out.println("*".repeat(i));
		}
		*/


		for(int j=num; j>=1;j--){
			for(int k=j; k>=1; k--){
				System.out.print("*");
			}
			System.out.println();
		}



	}
}






import java.util.Scanner;


public class _05IncomeTax{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);


		System.out.print("Enter your income: ");
		float num1 = sc.nextInt();

		if (num1<500000){
			System.out.println("your income tax is: " + 0);
		}
		else if ( num1>=500000 && num1<1000000 ){
			System.out.println("your income tax is: "+ (num1*.20));
		}

		else{
			System.out.println("your income tax is: "+ (num1*.30));

		}
	}

}
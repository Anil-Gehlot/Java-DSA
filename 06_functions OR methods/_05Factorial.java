

import java.util.Scanner;

public class _05Factorial{

	public static int fact(int a){
		int ans = 1;
		for(int i=1; i<=a; i++){
			ans = ans*i;
		}
		return ans;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. for factorial: ");
		int num = sc.nextInt();

		int final_fact = fact(num);
		System.out.println("Factorial of "+num +" is: "+final_fact);


	}
}
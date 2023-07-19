

import java.util.Scanner;

public class _12Binarytodecimal{

	public static double dec(int a){
		double dec = 0;
		int pow = 0;
		int l_digit = a%10;

		while(a>0){
			dec = dec + (l_digit*Math.pow(2,pow));
			pow++;
			a = a/10;
			l_digit= a%10;
		}
		return dec;
	}





	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter binary number: ");
		int num = sc.nextInt();

		double ans = dec(num);

		System.out.println("decimal number: " + ans);
	}
}
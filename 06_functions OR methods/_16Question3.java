/*

Write a Java method to compute the sum of the digits in an integer.

(Hint : Approach this question in the following way :
a.	Take a variable sum = 0
b.	Find the last digit of the number
c.	Add it to the sum
d.	Repeat a & b until the number becomes 0 )





*/

import java.util.Scanner;

public class _16Question3{

	public static int sumofDigits(int a){
		int sum = 0;
		int rem = a%10;
		while(a>0){
			sum = sum + rem;
			a = a/10;
			rem=a%10;
			
		}
		return sum;
	}




	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = sc.nextInt();

		int ans = sumofDigits(num);
		System.out.println("Total Sum: " + ans);


	}
}



import java.util.Scanner;

public class _03callByValue{



	public static void Swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		// here swapped value will be printed..
		System.out.println("a: " + a);		
		System.out.println("b: " + b);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();

		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();

		Swap(a,b);

		/*
		here swapped value will not be printed because of call by value...
		*/
		System.out.println("a: " + a);
		System.out.println("b: " + b)
;
	}
}
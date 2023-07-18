


import java.util.Scanner;

public class _04Product{

	public static float Product(float a, float b){
		float calc = a *b;
		return calc;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value of a: ");
		float a = sc.nextFloat();

		System.out.print("Enter value of b: ");
		float b = sc.nextFloat();


		float ans = Product(a,b);
		System.out.println("Product of a & b: " + ans);



	}
}
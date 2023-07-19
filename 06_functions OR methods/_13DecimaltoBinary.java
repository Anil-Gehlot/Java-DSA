


import java.util.Scanner;

public class _13DecimaltoBinary{

	public static int binary(int a){
		int pow = 0;
		int bin = 0;
		int rem = a%2;

		while(a > 0){

			bin = bin + (rem* (int) (Math.pow(10, pow)));
			pow++;
			a = a/2;
			rem = a%2;
		}
		return bin;
	}




	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		int num = sc.nextInt();

		int ans = binary(num);
		System.out.println("Binary number: "+ ans);
	}
}

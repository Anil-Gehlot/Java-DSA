

import java.util.Scanner;

public class AreaofSquare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the side of squar: ");
		int side = sc.nextInt();

		int area = side * side;

		System.out.println("Area of square is : " + area);
	}
}
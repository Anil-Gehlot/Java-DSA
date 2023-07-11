

import java.util.Scanner;


public class Cost{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);


		System.out.print("Enter the price of pencil: ");
		float pencil = sc.nextInt();

		System.out.print("Enter the price of pen: ");
		float pen = sc.nextInt();

		System.out.print("Enter the price of eraser: ");
		float eraser = sc.nextInt();

		float total = pencil + pen + eraser;

		float $gst = (total*18)/100;

		System.out.println("Total Cost including GST: "+ (total+$gst));
	}
}
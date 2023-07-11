
import java.util.*;

public class UserInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter a word  only: ");
		String name = sc.next();
		System.out.println("Your word is: " +name);


		System.out.print("Enter a sentence or paragraph: ");
		String para = sc.nextLine();
		System.out.println("Your sentence is: " +para);



		

		System.out.print("Enter a byte number: ");
		byte b = sc.nextByte();
		System.out.println("Your byte number is: " +b);


		System.out.print("Enter a short number: ");
		short s = sc.nextShort();
		System.out.println("Your short number is: " +s);


		System.out.print("Enter a integer number: ");
		int num_int = sc.nextInt();
		System.out.println("Your integer number is: " +num_int);



		System.out.print("Enter a long number: ");
		long num_long = sc.nextLong();
		System.out.println("Your long number is: " +num_long);



		System.out.print("Enter a float number: ");
		float flt = sc.nextFloat();
		System.out.println("Your float number is: " +flt);


		System.out.print("Enter a double number: ");
		double dble = sc.nextDouble();
		System.out.println("Your double number is: " +dble);



		/*
		nextChar() method dowsn't exist.we can not take input as a char value
		
		System.out.print("Enter a char value ");
		char chr = sc.nextChar();
		System.out.println(chr);
		*/


		/*  we have a alternative of nextChar().
			next() is capturing input from the user and charAt() method me hum index de sakte he,
			ki user ke dwara diye gaye input me se kon se index ka char value chahiye.*/


		System.out.print("Enter a char value ");
		char t = sc.next().charAt(0);   // here this is the indexing of the element to take //
		System.out.println("Your char value is: " + t);


		





	}
}


import java.util.*;

public class AreaOfCircle{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of circle: ");
		float radius = sc.nextFloat();

		float area = 3.14f * radius * radius;

		System.out.println("Area of Circle is: " + area );

		sc.close();


	}

}
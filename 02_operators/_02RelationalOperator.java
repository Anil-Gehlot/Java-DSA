

public class _02RelationalOperator{
	public static void main(String args[]){

		int a = 5;
		int b = 5;
		int c = 10;
		int d = 10;


		System.out.println( (a==b) );	// true
		System.out.println( (a==c) );	// false

		System.out.println( (a!=b) );	//	false
		System.out.println( (a!=c) );	// true

		System.out.println(a > b);	// false
		System.out.println(d > b);	// true

		System.out.println(a < b);	// false
		System.out.println(d < b);	// true

		System.out.println(a >= b);	// true
		System.out.println(d >= b);	// true

		System.out.println(a <= b);	// true
		System.out.println(d <= b);	// false


	}
}
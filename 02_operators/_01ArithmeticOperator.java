

public class _01ArithmeticOperator{
	public static void main(String args[]){

		int a = 10;
		int b = 5;

		int x = 2;
		int y = 4;

		
		//  Binary Oprator.
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println();




		/*

		Unary operator :- unary operator do type ke hote he(increment & increment ).

		increment:-      ++a(pre-increment),		a++(post-increment)
		decrement:-		--a(pre-decrement),			a--(post-decrement)

		pre-increment & pre-decrement  firstly make changes to the original value and then use it.
	
		post-increment & post-decrement firstly use the original value and then change it.
		*/
		int c = ++a;
		System.out.println(a);	// 11
		System.out.println(c);	// 11
		// System.out.println(a * b);
		System.out.println();


		int d = --b;
		System.out.println(b);	// 4
		System.out.println(d);	// 4
		System.out.println();



		int p = x++;
		System.out.println(x);	// 3
		System.out.println(p);	// 2



		int q = y--;
		System.out.println(y);	// 3
		System.out.println(q);	// 4

	}
}
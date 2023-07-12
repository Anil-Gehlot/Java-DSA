


public class TypePromotion{
	public static void main(String args[]){
		char a = 'a';
		char b = 'b';


		System.out.println(b);
		System.out.println((int)b);
		System.out.println(b-a);		// 	b and a converted into int.


		short p = 5;
		byte q = 25;
		char r = 'c';



		// byte bt = a + b + r;		// possible lossy conversion from int to byte
		// System.out.println(bt);

		byte bt = (byte)(a + b + r);		// possible lossy conversion from int to byte
		System.out.println(bt);


		int x = 10;
		float y = 34.43f;
		long z = 3453453l;
		double z1 = 30;

		double ans = x + y+ z + z1;
		System.out.println(ans);


		/*
		byte k = 5;
		byte l = b*2;	// 	 incompatible types: possible lossy conversion from int to byte.

		System.out.println(l);
		*/

		byte k = 5;
		int n = (k*2);
		byte m = (byte) (k*6);

		System.out.println(n);
		System.out.println(m);

	}
}
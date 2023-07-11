

/*

	TypeCasting:- 	also known as narrowing conversion or explicit conversion.





*/

public class TypeCasting{
	public static void main(String args[]){

		/*

		float a = 25.43f;
		int b = a;


		System.out.println(b);	 incompatible types: possible lossy conversion from float to int
		*/

		float a = 25.43f;
		int b = (int)a ;
		System.out.println(b);

	}
}
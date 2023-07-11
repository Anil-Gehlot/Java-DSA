
/*

Type Conversion :- ek type ke data ko dusre type ke data me convert karna.
					it is also known as widening conversion or implicit conversion.

	byte -> short -> int -> float -> long -> double.

	long can also be converted into float.


conversion is possible when:
	1. type compatible ho.
	2. destination type > source type.



*/



public class TypeConversion{
	public static void main(String args[]){

	

	// conversion int to float.
	int a = 25;
	float b = a;

	System.out.println("a: " + a +"\nb: " +b );


	// conversion long into float.
	long l = 21474836509l;
	float e = l;
	System.out.println(e);

	// char to int.
	char c = 'a';

	float d = c;
	System.out.println(d);


	
}

}
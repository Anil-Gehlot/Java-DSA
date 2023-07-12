

public class _03LogicalOperator{
	public static void main(String args[]){


		//	Logical AND (&&)
		System.out.println( (3>2) && (5>4));	// true
		System.out.println( (3<2) && (5>4));	// false
		System.out.println( (3<4) && (5>4));	// true
		System.out.println( (3<2) && (5<4));	// false
		System.out.println();


		//  Logical OR ( || )
		System.out.println( (1>3) || (3<1) );	// false
		System.out.println( (1>3) || (3>1) );	// true
		System.out.println( (1<3) || (3<1) );	// true
		System.out.println( (1<3) || (3>1) );	// true


		//	Logical Not ( ! )
		System.out.println( !(1>2)); 	//	true
		System.out.println( !(1<2));	// false
		System.out.println();

	}
}
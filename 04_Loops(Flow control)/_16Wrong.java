


//  in this program we can use variable i only within the loop;

public class _16Wrong{

	public static void main(String args[]) {

		for(int i = 0; i <= 5; i++ ) {

			System.out.println("i = " + i );
		}
		System.out.println("i after the loop = " + i );
	}
}
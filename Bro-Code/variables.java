package BroCode;

public class brocode01 {
	//Variables = a space in memory that holds some sort of data
	
	/*
	 * Data Type	Size	value
	 * boolean		1bit	true or false
	 * byte			1byte	-128 to 127
	 * short		2bytes	-32,768 to 32,767
	 * int			4bytes	-2 billion to 2billion
	 * long			8bytes	-9 quintilion to 9 quintilion
	 * 
	 * float		4bytes	fractional number up to 6-7 digits ex. 3.141592f
	 * double		8bytes	fractional number up to 15 digits ex; 3.141592653589793f
	 * 
	 * char			2bytes	single character/letter/ASCII value
	 * String		varies	a sequence of charactes
	 * */
	
	/*
	 * ---Primitive					---References
	 * 8 types (boolean,byte,etc.)	unlimited (userdefined)
	 * stores data					stores an adress
	 * can only hold 1 value		could hold more than 1 value
	 * less memory					more memory
	 * fast							slower
	 * */
	
	//Declaration int x; + assignment x = 123;
	// or we can use initialization int x = 123;
	

	public static void main(String[] args) {
		
		int x = 123;
		float y = 3.14f;
		boolean z = true;
		char symbol = '@';
		String name = "Winkler";
		
		
		System.out.println("Number : " + x +
						   "\nFloat : " + y +
						   "\nboolean : " + z +
						   "\nchar : " + symbol + 
						   "\nString : " + name );

	}

}

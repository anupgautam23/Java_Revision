package Day1.Que5;

public class EqualsDemo {
	

	public static void main(String[] args) {
		// first snipped code 
		
	String str1  = new String("abc");
	String str2  = new String("abc");
	
	System.out.println(str1==str2);
	/* str1 and str2 string are saved in different heap memory and their location  is different
	 * but here == operator compare the reference value thats why it gives false
	 * */
	System.out.println(str1.equals(str2));
	/* .equals method compare the actual content of the object and both content are equal 
	 * therefore output is true
	 * */
	
	/*--------------------------------------------------------------------------------------------*/
	
	
	   // second snipped code
	
	StringBuffer sb1 = new StringBuffer("abc");
	StringBuffer sb2 = new StringBuffer("abc");
	
	System.out.println(sb1==sb2);
	System.out.println(sb1.equals(sb2));
	
	/*
	 * The output is false for the first example and true for the second example. 
	 * In second example, parameter to equals() belongs String class, while in first 
	 * example it to StringBuffer class. When an object of String is passed, the strings 
	 * are compared. But when object of StringBuffer is passed references are compared 
	 * because StringBuffer does not override equals method of Object class.
	 * */
		
	}

}

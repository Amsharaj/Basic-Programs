package Access_modifier;

public class Boolean_str {

	public static void main(String[] args) {
		//create boolean variables
		boolean booleanvalue1=true;
		boolean booleanvalue2=false;
		
		//convert boolean to string using to string()
		String Stringvalue1=Boolean.toString(booleanvalue1);
		String Stringvalue2=Boolean.toString(booleanvalue2);
		
		System.out.println(Stringvalue1);       //true
		System.out.println(Stringvalue2);       //false
	}

}

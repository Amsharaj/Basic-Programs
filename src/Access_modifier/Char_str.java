package Access_modifier;

public class Char_str {

	public static void main(String[] args) {
		char ch='c';
		String st=Character.toString(ch);
//Alternatively
		String st1=String.valueOf(ch);
		
		System.out.println("The string is:"+st);
		System.out.println("The string is:"+st1);
	}

}

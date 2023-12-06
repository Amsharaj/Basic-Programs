package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
	Pattern pattern=Pattern.compile("java training",Pattern.CASE_INSENSITIVE);
	
	Matcher matcher=pattern.matcher("Wellcom Java Training");
	boolean matchfound=matcher.find();
	if(matchfound) {
		System.out.println("Match Found");
	}
	else {
		System.out.println("Match Not Found");
	}
	}

}

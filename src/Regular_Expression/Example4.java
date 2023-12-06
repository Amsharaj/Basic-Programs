package Regular_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

	public static void main(String[] args) {
		List < String > names=new ArrayList < String >();
		names.add("Imarticus");
		names.add("Imartics123");
		names.add("Imartics---///");//Incorrect
		String regex = "^[a-zA-Z0-9]+$";//regex start with "^" and ends with "$".
		Pattern p=Pattern.compile(regex);
		for(String name:names) {
			Matcher m=p.matcher(name);
			System.out.println(m.matches());
		}
	}
}

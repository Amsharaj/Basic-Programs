package Regular_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {

	public static void main(String[] args) {
		List<String>words=Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten");
		Pattern p=Pattern.compile(".ix");
		for(String word:words) {
			Matcher m=p.matcher(word);
			if(m.matches())
				System.out.printf("%s -> matches%n",word);
			else
				System.out.printf("%s -> does not match%n",word);
		}
	}

}

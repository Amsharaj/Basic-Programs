package Access_modifier;

import java.util.Arrays;

public class Str_char_array {

	

	public static void main(String[] args) {
		String st="This is great";
		char[]ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==ch.length-1)
				System.out.print(ch[i]);
			else
				System.out.print(ch[i]+", ");
			
		}
		System.out.println();
		System.out.println(Arrays.toString(ch));
	}

}

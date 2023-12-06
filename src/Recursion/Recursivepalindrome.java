package Recursion;

public class Recursivepalindrome {

	public static void main(String[] args) {
	boolean flag=palindromecheck("madam");
	System.out.println(flag);
	flag=palindromecheck("nine");
	System.out.println(flag);
	flag=palindromecheck("malayalam");
	System.out.println(flag);

	}
static boolean palindromecheck(String s) {
	if(s.length()==0||s.length()==1) {
		return true;
	}
	if(s.charAt(0)==s.charAt(s.length()-1)) {
		return palindromecheck(s.substring(1,s.length()-1));
	}
	return false;
}
}

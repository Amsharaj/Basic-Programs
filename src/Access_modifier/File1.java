package Access_modifier;

public class File1 {

	public int a=10;//class variable
	private int b=20;
	//private modifier only visible in the class 
	public void display() {
		 System.out.println("a="+a);
		 System.out.println("b="+b);
	}
}

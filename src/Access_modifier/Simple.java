package Access_modifier;

class A
{ int a=10;//class variable
private int b=20;
//private modifier only visible in the class 
void display() {
	 System.out.println("a="+a);
	 System.out.println("b="+b);
}

	}

public class Simple {

	public static void main(String[] args) {
		A obj = new A();
		obj.display();
System.out.println(obj.a);
	}

}

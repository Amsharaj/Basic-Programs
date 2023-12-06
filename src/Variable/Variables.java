package Variable;

public class Variables {
	int b=100;//instance variable or class variable have the default value
	public static int x;//static variable-no need to create an abject to call this variable
	public void local_var() {
		int a=10;//local variable dose not have the default value
		System.out.println("local a="+a);
		System.out.println("local b="+b);
	}
	void display() {
		System.out.println("display b="+b);
	}

	public static void main(String[] args) {
		 Variables obj=new  Variables();
		 obj.local_var() ;
		 obj.display();
		 System.out.println(obj.b); 
	
		 System.out.println("x="+x);
	}

}

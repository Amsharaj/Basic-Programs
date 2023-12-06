package Variable;

public class Outer {
	// static member of the outer class
			private static char grade='A';
			static void test() {
				System.out.println("Grade:inside static method "+grade);
			}
			//static class
			static class nested{
				//non static method
				public void fun() {
					//nested class can access the static members of the outer class
					System.out.println("Grade:inside nested class: "+grade);
				}
			}
			public class check{
				void display() {
					System.out.println("Check class Grade: "+grade);
				}
			}
			
	
	public static void main(String[] args) {
		Outer.nested obj=new Outer.nested();
		obj.fun();//static class method
		System.out.println("static variable: "+grade);//static variable
		test();//static method inside the outer class
		Outer.check ck=new Outer().new check();
		ck.display();
				
		
	
	

	}

}

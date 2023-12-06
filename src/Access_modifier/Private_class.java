package Access_modifier;

class base {
 int stud_no=12;//stud_no and stud_name is STATE;
protected String stud_name="Nisha";
void display() {//display() is behaviour
	System.out.println("Student ID:"+stud_no);
	System.out.println("Student Name:"+stud_name);
	
}
}
public class Private_class{
	public static void main(String[] args) {
		base obj = new base();
		System.out.println("Calling the method");
obj.display();
System.out.println("Calling the State");
System.out.println(obj.stud_name);
	}

}

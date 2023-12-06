package Day3;

public class Bitwise {

	public static void main(String[] args) {
	int a=60;/*60=00111100*/
int b=13;//13=00001101
int c=0;
c=a&b;
System.out.println("a&b= " +c);
c=a|b;
System.out.println("a|b= " +c);
c=a^b;
System.out.println("a^b= " +c);
c=~a;
System.out.println("~a= " +c);
c=a>>2;
System.out.println("a>>2= " +c);
c=a<<2;
System.out.println("a<<2= " +c);
c=a>>>2;
System.out.println("a>>>2= " +c);
	}

}

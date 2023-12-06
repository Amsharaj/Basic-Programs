package Number_methods;

public class File1 {

	public static void main(String[] args) {
		//wrapper class
		//converting integer object into float/double object
		/*Integer x=10;
	Float f =x.floatValue();
	System.out.println(x.floatValue());
	System.out.println("f="+f);
	//converting primitive data type into object
	String str="10";//primitive data type
	Integer y=Integer.parseInt(str);
	Double d=y.doubleValue();
	System.out.println("y="+y);
	System.out.println("d="+d);
	//String str2 = d.toString();
	System.out.println(d.toString());

		Integer num1=10;Integer num2=20;
		System.out.println(num1.compareTo(num2));
		System.out.println(num1.equals(num2));
		
		String a="hello";
		String b="hello";
		if(a.equals(b))
			System.out.println("Both strings are equal");
		if(a.compareTo(b)==0)
			
			System.out.println("Both strings are equal");
		Double f1=-20.54;
		System.out.println("abs="+Math.abs(4-7));
		System.out.println("ceil="+Math.ceil(f1));
		System.out.println("round="+Math.round(f1));
		System.out.println("floor="+Math.floor(f1));
		System.out.println("Minimum Value="+Math.min(12, 24));
		System.out.println("Minimum Value="+Math.max(24, 12));
		System.out.println(Math.pow(2,5));
		System.out.println("Escape sequence =/r");
		System.out.println("Escape sequence =/n");
		System.out.print("This is \"java\" program");
		
		
		
		//Character method
		System.out.println(Character.isLetter('5'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isLowerCase('c'));
		System.out.println(Character.isLowerCase('C'));
		System.out.println(Character.isLowerCase('\n'));
		System.out.println(Character.isLowerCase('\t'));
		
		
		
		
		System.out.println(Character.toLowerCase('c'));
		System.out.println(Character.toUpperCase('C'));*/
		
		
		
		//String method
		String str2="Welcome";
		String str3="WElcome";
		System.out.println(str2.charAt(5));
		//System.out.println(str2.charAt(10));
		System.out.println(str2.compareTo(str3));
		System.out.println(str2.compareToIgnoreCase(str3));
		
		
		System.out.println(str2.concat(str3));
		System.out.println(str2.length());
		System.out.println(str2.substring(4));
		System.out.println(str2.substring(2,7));
		System.out.println(str2.replace('e','a'));
		
	}

}


package Access_modifier;

public class spilt_str_space {

	public static void main(String[] args) {
		String text="Java is a fun programming language";
		
		//Spilt String from Space
		String[]result=text.split(" ");
		
		System.out.print("result=");
		for(String str:result) {
			System.out.print(str+",");
		}
  
		
		
	}

}

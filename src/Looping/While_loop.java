package Looping;

public class While_loop {

	public static void main(String[] args) {
	//Arrays
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
	    System.out.println(arr[i]) ;                    
		}
		//for each loop
		System.out.println("for each loop");
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println(arr);//object reference
	}

}

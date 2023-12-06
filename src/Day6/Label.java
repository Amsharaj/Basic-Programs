package Day6;

public class Label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]number= {10,20,30,40,50};
		start:for(int x:number)
		{
			if(x==30) {
				continue start;
			}
			System.out.print(x);
		System.out.print("\n");
		}
	}

}
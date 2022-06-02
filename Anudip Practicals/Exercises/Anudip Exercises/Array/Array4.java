
public class Array4 {

	static int[] get() {
		return new int[] {10,20,30,40,50};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=get();
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}

OUTPUT
/*
10
20
30
40
50
*/

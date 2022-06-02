import java.util.*;

public class ArrayTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> element1=new ArrayList<String>();
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.trimToSize();
		System.out.println(element1);
	}

}
/*
OUTPUT:
shubham ajay om rajesh anudip
[shubham, ajay, om, rajesh, anudip]
*/

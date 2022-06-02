import java.util.*;
public class ArrayEmpty1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> element1=new ArrayList<String>();
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.add(scanner.next());
		System.out.println(element1.isEmpty());
		element1.isEmpty();
		System.out.println(element1.removeAll(element1));
	}
}
/*
OUTPUT:
shubham
om
ajay
rajesh
anudip
false
true
*/
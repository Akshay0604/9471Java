import java.util.*;


public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> element1=new ArrayList<String>();
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.add(scanner.next());
		element1.add(scanner.next());
		
		ArrayList<String> element2= (ArrayList<String>)element1.clone();
		
		System.out.println(element2);
	}

}
/*
 OUTPUT:
SHUBHAM
RAJESH
AJAY
OM
CARRY
[SHUBHAM, RAJESH, AJAY, OM, CARRY]

*/
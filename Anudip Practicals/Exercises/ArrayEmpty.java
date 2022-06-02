import java.util.*;
public class ArrayEmpty {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	ArrayList<String> element1=new ArrayList<String>();
	element1.add(scanner.next());
	element1.add(scanner.next());
	element1.add(scanner.next());
	element1.add(scanner.next());
	element1.add(scanner.next());
	element1.removeAll(element1);
	System.out.println(element1);
}
}

/*
OUTPUT:
SHUBHAM
RAJESH
AJAY
OM
CARRY
[]
*/
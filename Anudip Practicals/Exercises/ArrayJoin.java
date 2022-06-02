import java.util.*;

public class ArrayJoin {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	ArrayList<String> element1=new ArrayList<String>();
	element1.add(scanner.next());
	element1.add(scanner.next());
	element1.add(scanner.next());
	element1.add(scanner.next());
	element1.add(scanner.next());
	
	ArrayList<Integer> element2=new ArrayList<Integer>();
	element2.add(scanner.nextInt());
	element2.add(scanner.nextInt());
	element2.add(scanner.nextInt());
	element2.add(scanner.nextInt());
	element2.add(scanner.nextInt());
	
	System.out.println(element1);
	System.out.println(element2);
	System.out.println("add two element in one element");
	
	ArrayList element3=new ArrayList<>();
	element3.addAll(element1);
	element3.addAll(element2);
	System.out.println(element3);
}
}

/*OUTPUT:
shubham
raje
bh
bhbh
bhhh
12
12
12
12
12
[shubham, raje, bh, bhbh, bhhh]
[12, 12, 12, 12, 12]
add two element in one element
[shubham, raje, bh, bhbh, bhhh, 12, 12, 12, 12, 12]
*/
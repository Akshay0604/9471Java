import java.util.*;
public class LinkedList7 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String> element1=new LinkedList<String>();
	element1.add("yash");
	element1.add("nik");
	element1.add("harshu");
	System.out.println("original linkedlist:\n"+element1);
	element1.add(1,"aditya");
	System.out.println("element add into specific position:\n"+element1);
	}
}
/*OUTPUT:
original linkedlist:
[yash, nik, harshu]
element add into specific position:
[yash, aditya, nik, harshu]
*/

import java.util.*;

public class LinkedList4 {
public static void main(String[] args) {
	LinkedList<String> element1=new LinkedList<String>();
	element1.add("nikhilesh");
	element1.add("harsharee");
	element1.add("yash");
	System.out.println("original linked list:"+element1);
	
	element1.offerFirst("aditya");
	System.out.println("element at the front of the linked list"+element1);
}
}
/*OUTPUT:
 original linked list:[nikhilesh, harsharee, yash]
element at the front of the linked list[aditya, nikhilesh, harsharee, yash]
*/

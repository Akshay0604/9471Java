import java.util.LinkedList;

public class LinkedList5 {
public static void main(String[] args) {
	LinkedList<String> element1=new LinkedList<String>();
	element1.add("nikhilesh");
	element1.add("yash");
	element1.add("harshu");
	System.out.println("original linked list:"+element1);
	
	element1.offerLast("aditya");
	System.out.println("element at the last of the linked list"+element1);
}
}
/*OUTPUT:
original linked list:[nikhilesh, yash, harshu]
element at the last of the linked list[nikhilesh, yash, harshu, aditya]

*/
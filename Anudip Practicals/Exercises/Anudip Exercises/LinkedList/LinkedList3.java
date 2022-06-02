import java.util.*;

public class LinkedList3 {
public static void main(String[] args) {
	LinkedList<String> element1=new LinkedList<String>();
	element1.add("nikhilesh");
	element1.add("yash");
	element1.add("harsharee");
	System.out.println("before insert element into linked list: \n"+element1);
	element1.addFirst("aditya");
	element1.addLast("mayuresh");
	System.out.println("after insert element into linked list:");
	System.out.println(element1);
}
}
/*
OUTPUT:
before insert element into linked list: 
[nikhilesh, yash, harsharee]
after insert element into linked list:
[aditya, nikhilesh, yash, harsharee, mayuresh]

*/
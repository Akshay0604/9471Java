import java.util.*;

public class LinkedList6 {
ppublic static void main(String[] args) {
			LinkedList<String> element1=new LinkedList<String>();
			element1.add("nikhilesh");
			element1.add("harshu");
			element1.add("yash");
			System.out.println("original linkedlist:\n"+element1);
			LinkedList<String> element2=new LinkedList<String>();
			element2.add("deepika");
			element2.add("aditya");
			System.out.println("after adding element in specific position:");
			element1.addAll(1,element2);
			System.out.println(element1);

}
}
/*OUTPUT:
original linkedlist:
[nikhilesh, harshu, yash]
after adding element in specific position:
[nikhilesh, deepika, aditya, harshu, yash]

*/
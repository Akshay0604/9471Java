import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		System.out.println("First Array list is: "+ list1);
		
		List<String> list2=new ArrayList<String>();
		list2.add("Nikhilesh");
		list2.add("Yash");
		list2.add("Harsharee");
		list2.add("Aditya");
		System.out.println("Second Array list is: "+list2);
		
		Collections.copy(list1, list2);
		System.out.println("Copy List1 to List2"+"\nAfter Copy: ");
		System.out.println(list1);
		System.out.println(list2);
	}

}

/*OUTPUT:
First Array list is: [1, 2, 3, 4]
Second Array list is: [Nikhilesh, Yash, Harsharee, Aditya]
Copy List1 to List2
After Copy: 
[Nikhilesh, Yash, Harsharee, Aditya]
[Nikhilesh, Yash, Harsharee, Aditya]

*/
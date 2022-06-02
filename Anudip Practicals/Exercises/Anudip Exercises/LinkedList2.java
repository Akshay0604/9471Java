import java.util.*;

public class LinkedList2 {
public static void main(String[] args) {
	List<String> list=new LinkedList<String>();
	list.add("Red");
	list.add("Blue");
	list.add("Orange");
	list.add("Pink");
	System.out.println("The colours present in array are: "+list);
	
	Iterator<String> itrIterable=list.iterator();
	while ( itrIterable.hasNext()) {
		System.out.println(itrIterable.next());
	}
}
}


OUTPUT
/*
The colours present in array are: [Red, Blue, Orange, Pink]
Red
Blue
Orange
Pink
*/
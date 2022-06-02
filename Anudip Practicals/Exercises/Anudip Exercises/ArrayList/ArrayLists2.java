import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists2 {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("Red");
	list.add("Pink");
	list.add("Blue");
	list.add("Orange");
	System.out.print("Array elements are: ");
	System.out.println(list);
	list.set(2,"Yellow");
	System.out.print("Updated Specific elements are: ");
	System.out.println(list);
}
}

/*OUTPUT:
Array elements are: [Red, Pink, Blue, Orange]
Updated Specific elements are: [Red, Pink, Yellow, Orange]
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list1=new ArrayList<Integer>();
list1.add(12);
list1.add(11);
list1.add(13);
list1.add(14);
System.out.println("Before Shorting Array: "+list1);
Collections.sort(list1);
System.out.println("After Shorting Array: "+list1);
	}
}

/*OUTPUT:
Before Shorting Array: [12, 11, 13, 14]
After Shorting Array: [11, 12, 13, 14]
*/
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new Vector<Integer>();
		list.add(12);
		list.add(10);
		list.add(13);
		list.add(14);
		
		System.out.println("Number present in array are: "+list);
		
		Iterator<Integer> iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

/*
OUTPUT

Number present in array are: [12, 10, 13, 14]
12
10
13
14
*/

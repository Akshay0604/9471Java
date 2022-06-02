import java.util.Arrays;

public class Shorting2 {
public static void main(String[] args) {
	int[] arr1= {12,10,11,9,20,14};
	String[] arr2= {"shubham", "rajesh","ajay"};
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
}
}

/*Output:
[9, 10, 11, 12, 14, 20]
[ajay, rajesh, shubham]
*/
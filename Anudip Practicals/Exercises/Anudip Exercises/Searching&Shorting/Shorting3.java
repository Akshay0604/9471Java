import java.util.Arrays;
import java.util.Collections;

public class Shorting3 {
public static void main(String[] args) {
	Integer[] numbers = new Integer[] { 18, 19, 13, 12, 15, 17, 16 };
	Arrays.sort(numbers, Collections.reverseOrder());
	
	System.out.println(Arrays.toString(numbers));
}
}

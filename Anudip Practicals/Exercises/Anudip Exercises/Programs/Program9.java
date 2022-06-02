import java.util.Arrays;
import java.util.Collections;

public class Program9 {
	
	
	public static void main(String[] args)
	{
		String arr[] = { "practice.geeksforgeeks.org",
						"quiz.geeksforgeeks.org",
						"code.geeksforgeeks.org" };
		Arrays.sort(arr);
		System.out.printf("Modified arr[] : \n%s\n\n",
						Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.printf("Modified arr[] : \n%s\n\n",
						Arrays.toString(arr));
	}
}

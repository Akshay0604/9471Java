public class SwappingAddress1{
	 public static void main(String[] args) {
	      IntWrapper a = new IntWrapper(30);
	      IntWrapper b = new IntWrapper(45);
	      System.out.println("Before swapping, a = " + a.a + " and b = " + b.a);
	      swapFunction(a, b);
	      System.out.println("\n*Now, Before and After swapping values will be different here*:");
	      System.out.println("After swapping, a = " + a.a + " and b is " + b.a);
	   }
	   public static void swapFunction(IntWrapper a, IntWrapper b) {
	      System.out.println("Before swapping(Inside), a = " + a.a + " b = " + b.a);
	      IntWrapper c = new IntWrapper(a.a);
	      a.a = b.a;
	      b.a = c.a;
	      System.out.println("After swapping(Inside), a = " + a.a + " b = " + b.a);
	   }
	}
	class IntWrapper {
	   public int a;
	   public IntWrapper(int a){ this.a = a;}
}

/*Output:
	Before swapping, a = 30 and b = 45
	Before swapping(Inside), a = 30 b = 45
	After swapping(Inside), a = 45 b = 30

	*Now, Before and After swapping values will be different here*:
	After swapping, a = 45 and b is 30
*/
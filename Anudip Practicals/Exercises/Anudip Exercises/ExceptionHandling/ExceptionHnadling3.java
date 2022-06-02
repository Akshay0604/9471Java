import java.util.Scanner;

public class ExceptionHnadling3 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter First number: ");
	int num1=scanner.nextInt();
	System.out.println("Entter Second number: ");
	int num2=scanner.nextInt();
	try {
		new ExceptionHnadling3().doDivide( num1,num2);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception condition program is ending:");
	}
}
	public void doDivide(int a,int b) throws Exception {
		float result = a/b;
		System.out.println("Division result of "+ a +"/"+b +"= " +result);

	}
}

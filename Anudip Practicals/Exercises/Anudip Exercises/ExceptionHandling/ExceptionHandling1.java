import java.util.Scanner;

public class ExceptionHandling1 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("First number enter");
	int num1=scanner.nextInt();
	System.out.println("Second number enter");
	int num2=scanner.nextInt();
	new ExceptionHandling1().doDivide(num1,num2);
}
public void doDivide(int a, int b) {
	float result=a/b;
	System.out.println("Division result of "+a+"/"+b+"="+result);
}
}

/*First output:
First number enter
12
Second number enter
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling1.doDivide(ExceptionHandling1.java:13)
	at ExceptionHandling1.main(ExceptionHandling1.java:10)

Second output:
First number enter
12
Second number enter
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling1.doDivide(ExceptionHandling1.java:13)
	at ExceptionHandling1.main(ExceptionHandling1.java:10)

*/
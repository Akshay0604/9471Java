import java.util.Scanner;
public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
int a,b;
a=scanner.nextInt();
b=scanner.nextInt();

int c=a;
a=b;
b=c;

System.out.print(a+" ");
System.out.print(b);
	}
}
/*
OUTPUT:
11
12
12 11
*/

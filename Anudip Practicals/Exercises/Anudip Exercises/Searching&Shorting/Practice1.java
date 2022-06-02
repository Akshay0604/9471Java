import java.util.Scanner;
public class Practice1 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	float a,b;
	a=scanner.nextFloat();
	b=scanner.nextFloat();
	
	System.out.println("Addition of a and b: "+a+b);
	System.out.println("Multiplication of a and b: "+a*b);
	System.out.println("Division of a and b:"+a/b);
	System.out.println("Average of a and b:"+((a+b)/2));
	
	if (a>b) {
		System.out.println("maximum number is :"+a);
	}
	if (b>a) {
		System.out.println("maximum no is: "+ b);
	}
	
	if (a<b) {
		System.out.println("minimum no si:"+ a);
	}
	if (b<a) {
		System.out.println("minimum no is:"+ b);
	}
	else {
		System.out.println("The maximum and minimum no is:"+(a));
	}
}
}
/*
  OUTPUT:
12
12
Addition of a and b: 12.012.0
Multiplication of a and b: 144.0
Division of a and b:1.0
Average of a and b:12.0
The maximum and minimum no is:12.0
 */

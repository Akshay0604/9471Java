public class Throw1{
static void validate(int age){
if(age<24)
{
throw new ArithmeticException("not valid");
}
else {
System.out.println("welcome to the club");
}
}
public static void main(String args[]){
validate(19);
System.out.println("code remainder");
}
}

/*Output:
Exception in thread "main" java.lang.ArithmeticException: not valid
	at Throw1.validate(Throw1.java:5)
	at Throw1.main(Throw1.java:12)
*/

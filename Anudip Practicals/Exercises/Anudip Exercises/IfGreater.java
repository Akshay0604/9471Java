//Take three numbers from the user and print the greatest number.
import java.util.Scanner;

public class IfGreater{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Test Data");
System.out.print("Input the 1st number:");
int a=sc.nextInt();
System.out.print("Input the 2nd number:");
int b=sc.nextInt();
System.out.print("Input the 3rd number:");
int c=sc.nextInt();
System.out.println("Expected Output :");
if(a>b&&a>c){
System.out.println("The Greatest: " +a);}
else if(b>a&&b>c){
System.out.println("The Greatest: " +b);}
else if(c>a&&c>b){
System.out.println("The Greatest: " +c);
}
else {
System.out.println("no. are equal ");}
}}

OUTPUT
/*
Test Data
Input the 1st number:17
Input the 2nd number:18
Input the 3rd number:19
Expected Output :
The Greatest: 19
*/
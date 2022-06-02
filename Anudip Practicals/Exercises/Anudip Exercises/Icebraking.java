/*1. When the value of count becomes 7 or 15, the continue statement plays its role and skip their execution but for other values of the count, the loop will run smoothly.
consider  i =20
solution:*/
public class Question1{
    public static void main(String[] args) {
        
        for(int i=20;i>=0;i--){
            if((i==7)||(i==15)){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
         
}

/*2. Write a program in Java to display the cube of the number upto given an integer. Go to the editor

Test Data
Input number of terms : 4
Expected Output :
                                             
Number is : 4 and cube of 4 is : 64
solution:*/
import java.util.Scanner;
public class Question2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Test Data");
        System.out.print("Input number of terms :");
        long num=sc.nextLong();
	System.out.println("Expected Output :");
        long cube=(num*num*num);
        System.out.println("Number is : "+num+"  and cube of "+num+" is "+cube);
    }
         
}

/*3. Write a Java program that takes two numbers as input and display the product of two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
solution:*/
import java.util.Scanner;
public class Question3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Test Data");
        int num1;
        int num2;
        System.out.print("Input First number :");
        num1=sc.nextInt();
        System.out.print("Input Second number :");
        num2=sc.nextInt();

        int product=num1*num2;
	System.out.prinyln("Expected Output :");
        System.out.println(num1+"*"+num2+"="+product);
        
    }
}


/*4. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
solution:*/
import java.util.Scanner;

public class Question4{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
System.out.println("Test Data: ");
System.out.print("Input first number: ");
int inputFirst=sc.nextInt();
System.out.print("Input second number: ");
int inputSecond=sc.nextInt();
System.out.println("Expected output: ");
int add=inputFirst+inputSecond;
System.out.println(inputFirst+"+"+inputSecond+"="+add);
int sub=inputFirst-inputSecond;
System.out.println(inputFirst+"-"+inputSecond+"="+sub);
int mul=inputFirst*inputSecond;
System.out.println(inputFirst+"*"+inputSecond+"="+mul);
int div=inputFirst/inputSecond;
System.out.println(inputFirst+"/"+inputSecond+"="+div);
int per=inputFirst%inputSecond;
System.out.println(inputFirst+" mod "+inputSecond+"="+per); }
}

/*5. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
solution:*/
import java.util.Scanner;

public class Question5{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
System.out.print("Input a number: ");
int userInput=sc.nextInt();
System.out.println("Expexted Output:");
for(int i=1;i<=10;i++){
int table=userInput*i;
System.out.println(userInput+"*"+i+"="+table);}
}}


/*6. Write a Java program to get a number from the user and print whether it is positive or negative. 


Test Data
Input number: 35
Expected Output :
Number is positive
solution:*/
import java.util.Scanner;

public class Question6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Test Data");
System.out.print("Input number: ");
int i=sc.nextInt();
System.out.println("Expected Output :");
if(i<0){
System.out.println("Number is negative");}
else if(i>0){
System.out.println("Number is possitive");}
else{
System.out.println("no is zero");}}}


/*7.Take three numbers from the user and print the greatest number. 

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
Solution:*/
import java.util.Scanner;
public class Question7{
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

/*8. Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39
solution:*/
import java.util.Scanner;
public class Question8{
 public static void main( String args[] )    
    { 
        Scanner input = new Scanner(System.in);
        int number1;  
        int number2;
        System.out.println( "Input Data: " ); 
        System.out.print( "Input first integer: " ); 
        number1 = input.nextInt(); 
        System.out.print( "Input second integer: " ); 
        number2 = input.nextInt();
 if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 );  
    }
}



/*9. Write a Java program to reverse a word. 
Sample Output:

Input a word: dsaf
Reverse word: fasd
solution:*/
import java.util.Scanner;
 public class Question9{
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);
     System.out.print("\nInput a word: ");
	 String word = in.nextLine();
	 word = word.trim();
	 String result = ""; 
     char[] ch=word.toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {
			 result += ch[i];
		 }
	 System.out.println("Reverse word: "+result.trim()); 
	 }			
}




/*10.  Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go to the editor
Sample Output:

1                                                                      
3                                                                      
5                                                                      
7                                                                      
9                                                                      
11                                                                     
....                                                                     
                                                                    
91                                                                     
93                                                                     
95                                                                     
97                                                                     
99 

Solution:*/
public class Question10{
public static void main(String[] args){
for(int i=1;i<100;i++){
if(i%2!=0){
System.out.println(i);
}}}}
//  Execute the programme for integer values 80, 75 and 60. Show the resulting outputs.
class ClassMain{
void disp(int number){
System.out.println ("method:" + number);
}
void disp(int number1, int number2){
System.out.println ("method:" + number1 + "," + number2);
}
double disp(double number) {
System.out.println("method:" + number);
return number;
}
}
class Polymorphism1
{
public static void main (String args [])
{
ClassMain obj = new ClassMain();
double result;
obj.disp(80);
obj.disp(75, 60);
result = obj.disp(6.1);
System.out.println("Answer is:" + result);
}
}
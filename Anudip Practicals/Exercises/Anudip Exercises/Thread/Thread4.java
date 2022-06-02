class T1{
synchronized void printTable(int n){
for(int i=2;i<=6;i++){
System.out.println(n*i);
try{
Thread.sleep(400);
}catch(Exception e){System.out.println(e);}
}
}
}
public class Thread4{
public static void main(String args[]){
final T1 obj = new T1();
Thread t1=new Thread(){
public void run(){
obj.printTable(2);

}
};
Thread t2=new Thread(){
public void run(){
obj.printTable(10);
}
};
t1.start();
t2.start();
}
}

/*OUTPUT:
4
6
8
10
12
20
30
40
50
60
*/
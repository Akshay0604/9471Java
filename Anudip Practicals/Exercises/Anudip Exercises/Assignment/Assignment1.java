public class Assignment1 extends Thread  
{  
   public void run()  
    {  
      try {  
          System.out.println("thread is executing now........");  
      } catch(Exception e) {  
      }   
    }  
    public static void main (String[] args) {  
        Assignment1 m1= new Assignment1();  
        m1.start();  
        m1.start();  
    }  
}

/* OUTPUT:
Exception in thread "main" java.lang.IllegalThreadStateException
at java.base/java.lang.Thread.start(Thread.java:793)
at Assignment1.main(Assignment1.java:13)
thread is executing now........
*/

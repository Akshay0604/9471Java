import java.util.Random;  
import java.util.concurrent.ArrayBlockingQueue;  
import java.util.concurrent.BlockingQueue;  
  
public class Assignment4 {  
  
   public static void main(final String[] arguments) throws InterruptedException {  
      BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);  
  
      Insert i = new Insert(queue);  
      Retrieve r = new Retrieve(queue);  
  
      new Thread(i).start();  
      new Thread(r).start();  
  
      Thread.sleep(2000);  
   }    
  
  
   static class Insert implements Runnable {  
      private BlockingQueue<Integer> queue;  
  
      public Insert(BlockingQueue queue) {  
         this.queue = queue;  
      }  
  
      @Override  
      public void run() {  
         Random random = new Random();  
  
         try {  
            int result = random.nextInt(200);  
            Thread.sleep(1000);  
            queue.put(result);  
            System.out.println("Added: " + result);  
              
            result = random.nextInt(10);  
            Thread.sleep(1000);  
            queue.put(result);  
            System.out.println("Added: " + result);  
              
            result = random.nextInt(50);  
            Thread.sleep(1000);  
            queue.put(result);  
            System.out.println("Added: " + result);  
         } catch (InterruptedException e) {  
            e.printStackTrace();  
         }  
      }      
   }  
  
   static class Retrieve implements Runnable {  
      private BlockingQueue<Integer> queue;  
  
      public Retrieve(BlockingQueue queue) {  
         this.queue = queue;  
      }  
        
      @Override  
      public void run() {  
           
         try {  
            System.out.println("Removed: " + queue.take());  
            System.out.println("Removed: " + queue.take());  
            System.out.println("Removed: " + queue.take());  
         } catch (InterruptedException e) {  
            e.printStackTrace();  
         }  
      }  
   }  
}
/*OUTPUT:
Added: 183
Removed: 183
Added: 1
Removed: 1
Added: 40
Removed: 40
*/
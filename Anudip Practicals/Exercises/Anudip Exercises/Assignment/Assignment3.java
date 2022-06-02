import java.util.concurrent.BlockingQueue;  
import java.util.concurrent.LinkedBlockingQueue;  
import java.util.logging.Level;  
import java.util.logging.Logger;  
public class Assignment3 {  
    public static void main(String args[]){  
     
     BlockingQueue sharedQueue = new LinkedBlockingQueue();  
  
  
     Thread prod = new Thread(new Producer(sharedQueue));  
     Thread cons = new Thread(new Consumer(sharedQueue));  
  
    
     prod.start();  
     cons.start();  
    }  
   
}  
  

class Producer implements Runnable {  
  
    private final BlockingQueue sharedQueue;  
  
    public Producer(BlockingQueue sharedQueue) {  
        this.sharedQueue = sharedQueue;  
    }  
  
    @Override  
    public void run() {  
        for(int i=0; i<10; i++){  
            try {  
                System.out.println("Produced: " + i);  
                sharedQueue.put(i);  
            } catch (InterruptedException ex) {  
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);  
            }  
        }  
    }  
  
}  
  

class Consumer implements Runnable{  
  
    private final BlockingQueue sharedQueue;  
  
    public Consumer (BlockingQueue sharedQueue) {  
        this.sharedQueue = sharedQueue;  
    }  
    
    @Override  
    public void run() {  
        while(true){  
            try {  
                System.out.println("Consumed: "+ sharedQueue.take());  
            } catch (InterruptedException ex) {  
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);  
            }  
        }  
    }  
}

/*OUTPUT:
Produced: 0
Produced: 1
Produced: 2
Produced: 3
Produced: 4
Produced: 5
Produced: 6
Produced: 7
Produced: 8
Produced: 9
Consumed: 0
Consumed: 1
Consumed: 2
Consumed: 3
Consumed: 4
Consumed: 5
Consumed: 6
Consumed: 7
Consumed: 8
Consumed: 9
*/
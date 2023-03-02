import java.util.*;
public class Imple_Q_usingDeque {

    static class Queue{
  static Deque <Integer> dq = new LinkedList<Integer>();
     public static void add(int data){  // Add operation
        dq.addLast(data);
     }
     public static int remove(){   //Remove operation
  return dq.removeFirst();
     }

     public static int peek(){   //Remove operation
        return dq.getFirst();
           }
           

    }
    
    public static void main(String args[]){
        Queue q = new Queue() ;
        q.add(45);
        q.add(56);
        q.add(516);
        q.add(956);
System.out.println(q.peek());        
q.remove();
System.out.println(q.peek());        


    }
}

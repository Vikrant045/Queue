import java.util.*;
public class Q_using2Stacks {

static class Queue{
   static Stack <Integer> s1 = new Stack<>();
   static Stack <Integer> s2 = new Stack<>();
public static boolean isEmpty(){  //IS_EMPTY
    return s1.isEmpty();
}
   public static void add(int data){ //ADD
   // while(s1.peek()!=data){
        if(s1.isEmpty()){
            s1.push(data);
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
   // }
   }

   public static int remove(){  //REMOVE
    if(isEmpty()){
        return -1;
    }
    return s1.pop();
   }
   public static int peek(){  //PEEK
    if(isEmpty()){
        return -1;
    }
    return s1.peek();
   }
   /**
 * @return
 */

}
    
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(1);
        q.add(2);
        q.add(3);

while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}

    }
}

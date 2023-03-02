import java.util.*;
public class Interleave_2HalvesOf_Q {
    public static Queue<Integer> interleave(Queue q){
        int n = q.size()/2;
        Queue <Integer> newQ = new LinkedList<>();

        while(newQ.size()!=n){
        newQ.add((Integer) q.remove());
        }
        while(!q.isEmpty() && !newQ.isEmpty()){
                q.add(newQ.remove());
                q.add((Integer) q.remove());

        }
        return q;
    }
    
public static void main(String args[]){
    Queue <Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
     q.add(3); 
     q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8); 
    q.add(9); 
    q.add(10);
   System.out.println(interleave(q)); 


}
}

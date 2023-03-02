import java.util.*;
public class Reverse_K_elementsOf_Q {

    public static Queue<Integer> reverse(Queue q,int k){

        Queue <Integer> qe = new LinkedList<>();
        Stack <Integer> s = new Stack<>();
     while(s.size()!=k){
        s.push((Integer) q.remove());
     }
     while(!q.isEmpty()){
     qe.add((Integer) q.remove());
     }
     while(!s.isEmpty()){
        q.add(s.pop());
     }
     while(!qe.isEmpty()){
        q.add(qe.remove());
     }

return q;
    }

    public static void main(String args[]){
        Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30); 
        q.add(40);
        q.add(50);
        q.add(60); 
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        System.out.println(reverse(q,2 ));

    }
    
}

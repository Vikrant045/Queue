import java.util.*;
public class GenerateBinaryNums {

    public static void binaryNums(int n){
        Queue<String> q = new LinkedList<>();
 q.add("1");
     while(n-->0){
        String s1 = q.peek();
        q.remove();
        System.out.print(s1+" ");
        String s2 = s1;
   q.add(s1+"0");
  q .add(s2+"1");

     }
      
    }
    
    public static void main(String args[]){
        int n =2;

    binaryNums(n);
    }
}

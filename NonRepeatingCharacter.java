import java.util.*;
public class NonRepeatingCharacter {

    public static void repeatingCharacter(String st){
        Queue <Character> q = new LinkedList<>();
int frequency[] = new int[26];
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            q.add(ch);
             frequency[ch-'a']++;

            while(!q.isEmpty() && frequency[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println("-1");
            }
            else{
                System.out.println(q.peek());

            }
        }
    }
    
    public static void main(String args[]){
        String st = "aabccxb";
        repeatingCharacter(st);
    }
}

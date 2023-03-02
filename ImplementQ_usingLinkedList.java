public class ImplementQ_usingLinkedList{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

     static class Queue{
        static Node head = null;
                static Node tail = null;

        public static void add(int data){
                        Node newNode  = new Node(data);    

            if(isEmpty()){
                head=tail=newNode;
            }
            tail.next= newNode;  
            tail=newNode;      
        }

        public static int remove(){
             if(isEmpty()){
                return -1;
            }
            int front = head.data;
            if(head==tail){
                head=tail=null;
            }
            else{
              head =  head.next;
            }
            return front;
        }
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            int front = head.data;
                    
            return front;
        }


                public static boolean isEmpty(){
return head==null && tail== null;
                }
        
    }

    public static void main(String args[]){

        Queue q = new Queue();
        q.add(12);
        q.add(122);
        q.add(1222);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }



    }

}
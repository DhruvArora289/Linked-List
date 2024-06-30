import java.util.*;
public class reverseall2 {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        int size;
        Node head,tail;
        void addlasttoll(int val){
            Node node=new Node();
            node.data=val;
            if(this.size==0){
                this.head=this.tail=node;
            }else{
                this.tail.next=node;
                this.tail=node;
            }
            this.size++;
        }
        void printList(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
        static Node leftrev;
        public void reverseDR(){
            leftrev=head;
            reverseDRHelper(head,0);
        }
        public void reverseDRHelper(Node node,int idx){
            if(node==null){
                return;
            }
            reverseDRHelper(node.next,idx+1);

            if(idx>=this.size/2){
                Node right=node;

                int tmp=leftrev.data;
                leftrev.data=right.data;
                right.data=tmp;

                leftrev=leftrev.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addlasttoll(10);
        ll.addlasttoll(30);
        ll.addlasttoll(40);
        ll.printList();
        ll.reverseDR();
        ll.printList();
    }
}

import java.util.*;
public class displayreverse {
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
        public void reverseDR(){
            reverseDRHelper(head);
            System.out.println();
        }
        public void reverseDRHelper(Node node){
            if(node==null){
                return;
            }
            reverseDRHelper(node.next);
            System.out.print(node.data+" ");
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

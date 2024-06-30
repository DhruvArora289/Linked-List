import java.util.*;
public class addfirstinll {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        int size;
        Node head,tail;
        void addfirsttoll(int val){
            Node node=new Node();
            node.data=val;
            if(this.size==0){
                this.head=this.tail=node;
            }else{
                node.next=this.head;
                this.head=node;
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
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addfirsttoll(10);
        ll.addfirsttoll(30);
        ll.addfirsttoll(40);
        ll.printList();
}
}

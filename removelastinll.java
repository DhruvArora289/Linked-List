import java.util.*;
public class removelastinll {
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
        void removelast(){
            if(this.size==0){
                System.out.println("List is empty");
                return;
            }
            if(this.size==1){
                this.head=this.tail=null;
            }
            Node tmp=this.head;
            while(tmp.next!=this.tail){
                tmp=tmp.next;
            }
            tmp.next=null;
            this.tail=tmp;
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addlasttoll(10);
        ll.addlasttoll(30);
        ll.addlasttoll(40);
        ll.printList();
        ll.removelast();
        ll.printList();
        ll.removelast();
        ll.printList();
}
}

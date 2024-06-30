import java.util.*;
public class midOfaLL {
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
        int mid(){
            Node slow=this.head;
            Node fast=this.head;
            while(fast!=tail && fast.next!=tail){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow.data;
        }
        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            ll.addlasttoll(10);
            ll.addlasttoll(20);
            ll.addlasttoll(30);
            ll.addlasttoll(40);
            ll.addlasttoll(50);
            ll.addlasttoll(60);
            ll.printList();
            System.out.println(ll.mid());
            ll.addlasttoll(70);
            ll.printList();
            System.out.println(ll.mid());
        }
    }
}

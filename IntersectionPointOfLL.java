import java.util.*;
public class IntersectionPointOfLL {
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
        public static int IntersectionPointOfLL(LinkedList one,LinkedList two){
            Node p1=one.head;
            Node p2=two.head;
            if(one.size>two.size){
                int diff=one.size-two.size;
                while(diff!=0){
                    p1=p1.next;
                    diff--;
                }
            }else{
                int diff=two.size-one.size;
                while(diff!=0){
                    p2=p2.next;
                    diff--;
                }
            }
            while(p1!=p2){
                p1=p1.next;
                p2=p2.next;
            }
            return p1.data;
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
        LinkedList ll1=new LinkedList();
        LinkedList ll2=new LinkedList();
        LinkedList ll=new LinkedList();
        ll1.addlasttoll(10);
        ll1.addlasttoll(20);
        ll1.addlasttoll(30);
        ll1.addlasttoll(40);
        ll1.addlasttoll(50);
        ll1.addlasttoll(60);
        ll1.addlasttoll(70);
        ll1.printList();
        ll2.addlasttoll(80);
        ll2.addlasttoll(70);
        ll2.tail.next=ll1.head.next.next.next.next;
        ll2.size+=3;
        ll2.printList();
        System.out.println(ll.IntersectionPointOfLL(ll1,ll2));

    }
}

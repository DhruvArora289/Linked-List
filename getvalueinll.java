import java.util.*;
public class getvalueinll {
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
        public int getfirst(){
            if(this.size==0){
                System.out.println("ll is empty");
                return -1;
            }
            return this.head.data;
        }
        public int getlast(){
            if(this.size==0){
                System.out.println("ll is empty");
                return -1;
            }
            return this.tail.data;
        }
        public int getAt(int idx){
            if(this.size==0){
                System.out.println("ll is empty");
                return -1;
            }
            if(idx<0 || idx>=this.size){
                System.out.println("invalid arguments");
                return -1;
            }
            Node tmp=head;
            while(idx>0){
                tmp=tmp.next;
                idx--;
            }
            return tmp.data;
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addlasttoll(10);
        ll.addlasttoll(20);
        ll.addlasttoll(30);
        ll.addlasttoll(50);
        ll.addlasttoll(60);
        ll.printList();
        System.out.println(ll.getfirst());
        System.out.println(ll.getlast());
        System.out.println(ll.getAt(3));
    }
}

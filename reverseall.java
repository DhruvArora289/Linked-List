import java.util.*;
public class reverseall {
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
        public Node getNodeAt(int idx){
            if(this.size==0){
                return null;
            }
            if(idx<0 || idx>this.size-1){
                System.err.println("invalid arguments");
                return null;
            }
            Node tmp=this.head;
            while(idx>0){
                tmp=tmp.next;
                idx--;
            }
            return tmp;
        }
        void reverseall(){
            int lp=0;
            int rp=this.size-1;
            while(lp<rp){
                Node left=getNodeAt(lp);
                Node right=getNodeAt(rp);
                int tmp=left.data;
                left.data=right.data;
                right.data=tmp;
                lp++;
                rp--;
            }
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
        ll.addlasttoll(10);
        ll.addlasttoll(30);
        ll.addlasttoll(40);
        ll.addlasttoll(50);
        ll.printList();
        ll.reverseall();
        ll.printList();
    }
}


import java.util.*;
public class FoldLL {
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
        static Node left;
        public void FoldLL(){
            left=head;
            FoldLLHelper(head,0);
        }
        public void FoldLLHelper(Node node,int idx){
            Node right=node;
            if(node==null){
                return;
            }
            FoldLLHelper(node.next,idx+1);
            if(idx==size/2){
                tail=right;
                right.next=null;
            }
            if(idx>size/2){
                Node nbr=left.next;
                left.next=right;
                right.next=nbr;
                left=nbr;
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
        ll.addlasttoll(1);
        ll.addlasttoll(2);
        ll.addlasttoll(3);
        ll.addlasttoll(4);
        ll.addlasttoll(5);
        ll.addlasttoll(6);
        ll.addlasttoll(7);
        ll.addlasttoll(8);
        ll.printList();
        ll.FoldLL();
        ll.printList();
    }
}

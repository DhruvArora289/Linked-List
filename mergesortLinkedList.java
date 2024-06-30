import java.util.*;
public class mergesortLinkedList {
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
        public static Node midNode(Node head,Node tail){
            Node f=head;
            Node s=head;

            while(f!=tail && f.next!=tail){
                f=f.next.next;
                s=s.next;
            }
            return s;
        }
        public static LinkedList mergeTwoSortedLL(LinkedList left,LinkedList right){
            LinkedList res=new LinkedList();
            Node f=left.head;
            Node s=right.head;
            while(f!=null && s!=null){
                if(f.data<s.data){
                    res.addlasttoll(f.data);
                    f=f.next;
                }else{
                    res.addlasttoll(s.data);
                    s=s.next;
                }
            }
                while(f!=null){
                    res.addlasttoll(f.data);
                    f=f.next;
                }
                while(s!=null){
                    res.addlasttoll(s.data);
                    s=s.next;
                }
                return res;
        }
        public static LinkedList mergeSort(Node head,Node tail){
            if(head==tail){
                LinkedList base=new LinkedList();
                base.addlasttoll(head.data);
                return base;
            }
            Node mid=midNode(head,tail);
            LinkedList left=mergeSort(head,mid);
            LinkedList right=mergeSort(mid.next,tail);
            return mergeTwoSortedLL(left,right);
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
        ll.addlasttoll(5);
        ll.addlasttoll(17);
        ll.addlasttoll(16);
        ll.addlasttoll(4);
        ll.addlasttoll(1);
        ll.addlasttoll(2);
        ll.addlasttoll(7);
        ll.addlasttoll(14);
        ll.printList();
        LinkedList list=ll.mergeSort(ll.head,ll.tail);
        list.printList();
    }
}

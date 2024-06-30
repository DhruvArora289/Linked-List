import java.util.*;
public class removeatindex {
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
        void removefirst(){
            if(this.size==0){
                System.out.println("List is empty");
                return;
            }else if(this.size==1){
                head=tail=null;
            }else{
                Node nbr=this.head.next;
                this.head.next=null;
                this.head=nbr;
            }
            this.size--;
        }
        void removelast(){
            if(this.size==0){
                System.out.println("List is empty");
                return;
            }else if(this.size==1){
                head=tail=null;
            }else{
                Node tmp=this.head;
                while(tmp.next!=this.tail){
                    tmp=tmp.next;
                }
                tmp.next=null;
                this.tail=tmp;
            }
            this.size--;
        }
        void removeatidx(int idx){
            if(idx<0 || idx>=this.size){
                System.out.println("invalid arguments");
                return;
            }else if(idx==0){
                removefirst();
            }else if(idx==this.size-1){
                removelast();
            }else{
                Node temp=head;
                while(idx>1){
                    temp=temp.next;
                    idx--;
                }
                Node nbr=temp.next;
                temp.next=nbr.next;
                nbr.next=null;
                this.size--;
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
        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            ll.addlasttoll(10);
            ll.addlasttoll(20);
            ll.addlasttoll(30);
            ll.addlasttoll(40);
            ll.addlasttoll(50);
            ll.addlasttoll(60);
            ll.printList();
            ll.removeatidx(0);
            ll.printList();
            ll.removeatidx(4);
            ll.printList();
            ll.removeatidx(6);
            ll.printList();
            ll.removeatidx(2);
            ll.printList();
        }
    }
}

import java.util.*;
public class oddevenLinkedList {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        int size;
        Node head,tail;
        void addlast(int val){
            Node node=new Node();
            node.data=val;
            if(this.size==0){
                this.head=this.tail=node;
            }else{
                this.tail.next=node;
                node.next=null;
                this.tail=node;
            }
            this.size++;
        }
        int getFirst(){
            return this.head.data;
        }
        void addFirst(int val){
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
        int getLast(){
            return this.tail.data;
        }
        void removeFirst(){
            if(this.size==0){
                System.out.println("list is empty");
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
        void evenodd(){
            LinkedList ll1=new LinkedList();//odd
            LinkedList ll2=new LinkedList();//even
            while(this.size>0){
                if(this.head.data%2==0){
                    ll2.addlast(this.head.data);
                    this.removeFirst();
                }else{
                    ll1.addlast(this.head.data);
                    this.removeFirst();
                    
                }
            }
            if(ll1.size==0){
                this.head=ll2.head;
                this.tail=ll2.tail;
                this.size=ll2.size;
            }
            else if(ll2.size==0){
                this.head=ll1.head;
                this.tail=ll1.tail;
                this.size=ll1.size;
            }else if(ll1.size!=0 && ll2.size!=0){
                ll1.tail.next=ll2.head;
                this.head=ll1.head;
                this.tail=ll2.tail;
                this.size=ll1.size+ll2.size;
            }
            System.out.println("odd list:");
            ll1.printList();
            System.out.println("even list:");
            ll2.printList();
        }
        void printList(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
        
        public static void main(String[] args){
            LinkedList list=new LinkedList();
            list.addlast(1);
            list.addlast(2);
            list.addlast(3);
            list.addlast(4);
            list.addlast(5);
            list.addlast(6);
            list.addlast(7);
            list.addlast(8);
            list.addlast(9);
            list.addlast(10);
            list.printList();
            list.evenodd();
        }
        }
}

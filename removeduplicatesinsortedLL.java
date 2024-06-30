import java.util.*;
public class removeduplicatesinsortedLL {
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
        void printList(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
        public void removeduplicates(){
            LinkedList ll=new LinkedList();
            ll.addFirst(this.getFirst());
            while(this.size>0){
                if(this.getFirst()==ll.getLast()){
                    this.removeFirst();
                }else{
                    ll.addlast(this.getFirst());
                    this.removeFirst();
                }
            }
            this.head=ll.head;
            this.tail=ll.tail;
            this.size=ll.size;
    }
        public static void main(String[] args){
            LinkedList list=new LinkedList();
            list.addlast(1);
            list.addlast(1);
            list.addlast(1);
            list.addlast(2);
            list.addlast(2);
            list.addlast(3);
            list.addlast(3);
            list.addlast(4);
            list.removeduplicates();
            list.printList();
        }
        }
    }


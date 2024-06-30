import java.util.*;
public class removefirstinll {
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
        //my function
        void removefirst(){
            if(this.size==0){
                System.out.println("List is empty");
            }else if(this.size==1){
                head=tail=null;
            }else{
            this.head.data=this.head.next.data;
            this.head=this.head.next;
            this.size--;
            }
        }
        //video function
        void removefirst2(){
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
        void printList(){
            Node tmp=this.head;
            while(tmp!=null){
                System.out.println(tmp.data+" ");
                tmp=tmp.next;
            }
            System.out.println();
    }
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlasttoll(10);
        ll.addlasttoll(20);
        ll.addlasttoll(30);
        ll.printList();
        ll.removefirst();
        ll.removefirst2();
        ll.printList();
    }
}
}

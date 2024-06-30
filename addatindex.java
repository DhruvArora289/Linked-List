import java.util.*;
public class addatindex {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        int size;
        Node head,tail;
        void addfirst(int val){
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
        void addlast(int val){
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
        void addat(int idx,int val){
            Node node=new Node();
            node.data=val;
            if(idx<0 || idx>this.size){
                System.out.println("invalid arguments");
                return;
            }else if(idx==0){
                addfirst(val);
            }else if(idx==this.size){
                addlast(val);
            }else{
                Node tmp=this.head;
                while(idx>1){
                    tmp=tmp.next;
                    idx--;   
                }
                node.next=tmp.next;
                tmp.next=node;
                this.size++;
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
            LinkedList ll =new LinkedList();
            ll.addat(0, 10);
            ll.addat(1, 20);
            ll.addat(2, 30);
            ll.addat(3, 40);
            ll.addat(2, 50);
            ll.printList();
        }
    }
}

import java.util.*;
public class kthNodefromEndofLL{
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
        int kthNodedata(){
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            Node fwd=this.head;
            while(k>0){
                fwd=fwd.next;
                k--;
            }

            Node curr=this.head;
            while(fwd!=tail){
                fwd=fwd.next;
                curr=curr.next;
            }
            return curr.data;
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addlasttoll(10);
        ll.addlasttoll(30);
        ll.addlasttoll(50);
        ll.addlasttoll(60);
        ll.addlasttoll(70);
        ll.printList();
        System.out.println(ll.kthNodedata());
    }
}

//without implementing ll and using built-in java linkedlist
        // Iterator<Integer> fwd = ll.iterator();
        // Iterator<Integer> curr = ll.iterator();
        
        // for (int i = 0; i < k; i++) {
        //     if (fwd.hasNext()) {
        //         fwd.next();
        //     }
        // }
        
        // while (fwd.hasNext()) {
        //     fwd.next();
        //     curr.next();
        // }
        
        // return curr.next();
    
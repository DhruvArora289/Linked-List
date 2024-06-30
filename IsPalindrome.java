import java.util.*;
public class IsPalindrome {
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
        static Node leftpal;
        public boolean IsPalindrome(){
            leftpal=this.head;
            boolean res=IsPalindromeHelper(head,0);
            return res;
        }
        public boolean IsPalindromeHelper(Node node,int idx){
            if(node==null){
                return true;
            }
            boolean res=IsPalindromeHelper(node.next,idx+1);

            if(res){
                if(idx>=this.size/2){
                    if(leftpal.data==node.data){
                        leftpal=leftpal.next;
                        return true;
                    }else{
                        return false;
                    }
                }
            }
            return res;
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
        ll.addlasttoll(4);
        ll.addlasttoll(3);
        ll.addlasttoll(2);
        ll.addlasttoll(1);
        ll.printList();
        System.out.println(ll.IsPalindrome());
    }
}

import java.util.*;
public class AddTwoLinkedLists {
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
        void printList(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
        public LinkedList AddTwoLists(LinkedList one,LinkedList two){
            LinkedList res=new LinkedList();
            int carry=AddTwoListsHelper(one.head,two.head,one.size,two.size,res);
            if(carry!=0){
                res.addfirst(carry);
            }
            return res;
        }
        public int AddTwoListsHelper(Node n1,Node n2,int p1,int p2,LinkedList res){
            if(n1==null && n2==null){
                return 0;
            }
            int carry=0;
            int sum;
            if(p1 > p2){
                carry=AddTwoListsHelper(n1.next,n2,p1-1,p2,res);
                sum=n1.data+carry;
            }else if(p2>p1){
                carry=AddTwoListsHelper(n1,n2.next,p1,p2-1,res);
                sum=n2.data+carry;
            }
            else{
                carry=AddTwoListsHelper(n1.next,n2.next,p1-1,p2-1,res);
                sum=n1.data+n2.data+carry;
            }
            int digit=sum%10;
            carry=sum/10;
            res.addfirst(digit);
            return carry;
        }
    }
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        LinkedList ll2=new LinkedList();
        LinkedList ll=new LinkedList();
        ll1.addlasttoll(1);
        ll1.addlasttoll(2);
        ll1.addlasttoll(3);
        ll1.addlasttoll(4);
        ll1.addlasttoll(5);
        ll1.printList();
        ll2.addlasttoll(9);
        ll2.addlasttoll(9);
        ll2.addlasttoll(9);
        LinkedList res=ll.AddTwoLists(ll1,ll2);
        res.printList();
    }
}


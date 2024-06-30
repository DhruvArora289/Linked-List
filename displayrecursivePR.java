public class displayrecursivePR {
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
        public void reversePR(){
            reversePRHelper(head);
            Node tmp=this.head;
            this.head=this.tail;
            this.tail=tmp;
            this.tail.next=null;
        }
        public void reversePRHelper(Node node){
            if(node==null){
                return;
            }
            reversePRHelper(node.next);
            if(node!=tail){
                node.next.next=node;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addlasttoll(10);
        ll.addlasttoll(30);
        ll.addlasttoll(40);
        ll.printList();
        ll.reversePR();
        ll.printList();
    }
}

import java.util.*;
public class mergeTwoSortedLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> ans=merge();
        System.out.println(ans);
    }
    public static LinkedList merge(){
        LinkedList<Integer> list1=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        LinkedList<Integer> ans=new LinkedList<>();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(6);
        list1.addLast(10);
        list1.addLast(11);
        list1.addLast(12);
    
        list2.addLast(2);
        list2.addLast(5);
        list2.addLast(7);
        list2.addLast(8);
        list2.addLast(9);
        list2.addLast(10);
        ListIterator<Integer> iterator1=list1.listIterator();
        ListIterator<Integer> iterator2=list2.listIterator();
        while(iterator1.hasNext() && iterator2.hasNext()){
            Integer value1=iterator1.next();
            Integer value2=iterator2.next();
            if(value1<value2){
                ans.addLast(value1);
                iterator2.previous();
            }else{
                ans.addLast(value2);
                iterator1.previous();
            }
        }
        while(iterator1.hasNext()){
            ans.addLast(iterator1.next());
        }
        while(iterator2.hasNext()){
            ans.addLast(iterator2.next());
        }
        return ans;
    }
}

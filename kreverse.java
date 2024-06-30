import java.util.*;
public class kreverse {
    LinkedList<Integer> main=new LinkedList<>();
    public void kReverse(int k){
        LinkedList ans=new LinkedList();
        LinkedList curr=new LinkedList();
        while(main.size()>0){
            if(main.size()>=k){
                int i=1;
                while(i<=k){
                curr.addFirst(main.getFirst());
                main.removeFirst();
                i++;
                }
            }else{
                while(main.size()>0){
                curr.addLast(main.getFirst());
                main.removeFirst();
            }
        }
            ans.addAll(curr);
            curr=new LinkedList();
            }
            System.out.println(ans);
        }
        public void addLast(int value) {
            main.addLast(value);
        }
        public static void main(String[] args){
            kreverse main=new kreverse();
            main.addLast(1);
            main.addLast(2);
            main.addLast(3);
            main.addLast(4);
            main.addLast(5);
            main.addLast(6);
            main.addLast(7);
            main.addLast(8);
            main.addLast(9);
            main.addLast(10);
            main.addLast(11);
            main.kReverse(3);
        }
    }


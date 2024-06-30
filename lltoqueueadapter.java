import java.util.*;
public class lltoqueueadapter {
    public static class lltoqueue{
        LinkedList<Integer> list;
        public lltoqueue(){
            list=new LinkedList<>();
        }

        int size(){
            return list.size();
        }

        void add(int val){
            list.addLast(val);
        }

        int remove(){
            if(list.size()==0){
                System.out.println("stack underflow");
                return -1;
            }
            return list.removeFirst();
        }

        int peek(){
            if(list.size()==0){
                System.out.println("stack underflow");
                return -1;
            }
            return list.getFirst();
        }
        public static void main(String[] args){
            lltoqueue list=new lltoqueue();
            Scanner sc=new Scanner(System.in);
            while (true) {
              System.out.println("choices are: ");
              System.out.println("choice 1: size ");
              System.out.println("choice 2: add ");
              System.out.println("choice 3: remove ");
              System.out.println("choice 4: peek ");
              int choice=sc.nextInt();
                  switch (choice) {
                    case 1:
                        System.out.println(list.size());
                        break;
                    case 2:
                        int val=sc.nextInt();
                        list.add(val);
                        System.out.println(list.list);
                        break;
                    case 3:
                        System.out.println(list.remove());
                        break;
                    case 4:
                        System.out.println(list.peek());
                        break;
                    default:
                    System.out.println("invalid");
                    return;
                  }
              }
         }
    }
}

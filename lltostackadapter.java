import java.util.*;
public class lltostackadapter {
    public static class lltostack{
        LinkedList<Integer> list;

        public lltostack(){
            list=new LinkedList<>();
        }

        int size(){
            return list.size();
        }
        
        void push(int val){
            list.addFirst(val);
        }

        int pop(){
            if(this.size()==0){
                System.out.println("stack underflow");
                return -1;
            }
            return list.removeFirst();
        }

        int top(){
            if(this.size()==0){
                System.out.println("stack underflow");
                return -1;
            }
            return list.getFirst();
        }
    }
    public static void main(String[] args){
        lltostack list=new lltostack();
        Scanner sc=new Scanner(System.in);
        while (true) {
          System.out.println("choices are: ");
          System.out.println("choice 1: size ");
          System.out.println("choice 2: push ");
          System.out.println("choice 3: pop ");
          System.out.println("choice 4: top ");
          int choice=sc.nextInt();
              switch (choice) {
                case 1:
                    System.out.println(list.size());
                    break;
                case 2:
                    int val=sc.nextInt();
                    list.push(val);
                    System.out.println(list.list);
                    break;
                case 3:
                    System.out.println(list.pop());
                    break;
                case 4:
                    System.out.println(list.top());
                    break;
                default:
                System.out.println("invalid");
                return;
              }
          }
    }
}

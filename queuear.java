import java.util.Scanner;

public class queuear {
    static final int size = 1000000;
    int[] ar = new int[size];
    int top ;
    queuear(){
        top = -1;
    }
    public void q_print(){
        for(int i = 0;i<=top;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public boolean q_isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void q_enqueue(int x){
        top++;
        ar[top]  = x;
    }
    public void q_dequeue(){
        if(top==-1){
            return;
        }
        else if(top==0){
            top = -1;
        }
        else{
            for(int i = 0;i<top;i++){
                ar[i] = ar[i+1];
            }
            top--;
        }
    }
    public int q_front(){
        return ar[0];
    }
    public int q_rear(){
        return ar[top];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        queuear obj = new queuear();
        for(int i = 0;i<n;i++){
            obj.q_enqueue(sc.nextInt());
        }
        obj.q_print();
        System.out.println(obj.q_front());
        System.out.println(obj.q_rear());
        obj.q_dequeue();
        obj.q_print();
        System.out.println(obj.q_front());
        System.out.println(obj.q_rear());
    }

}

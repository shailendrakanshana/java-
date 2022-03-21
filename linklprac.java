import java.util.*;

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}
public class linklprac {
    node head;
    public void insertAtend(int x){
        node n = new node(x);
        node temp = head;
        if(head == null){
            head = n;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;

            }
            temp.next = n;
        }

    }
    public void middle(int n){
        if(n%2==0){
            node temp = head;
            int c = 1;
            while(temp!=null){
                if(c==(n/2)){
                    break;
                }
                c = c+1;
                temp = temp.next;
            }
            System.out.println("Middle is "+temp.data);
        }
        else{
            node temp = head;
            int c = 1;
            while(temp!=null){
                if(c==((n/2)+1)){
                    break;
                }
                c= c+1;
                temp = temp.next;
            }
            System.out.println("Middle is "+temp.data);
            

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        linklprac obj = new linklprac();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            obj.insertAtend(sc.nextInt());
        }
        obj.middle(n);

    }
    
}

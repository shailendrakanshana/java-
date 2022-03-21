import java.util.*;

class node{
    node next;
    int data;
    node(int data){
        this.data = data;
    }
}



public class prll {
    node head;
    public void insbeg(int x){
        node n = new node(x);
        n.next = head;
        head = n;
    }
    public void prnt(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insend(int x){
        node n = new node(x);
        if(head==null){
            head = n;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }
    }
    public static void main(String[] args) {
        prll obj = new prll();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            obj.insend(sc.nextInt());
        }
        obj.prnt();

    }
    
}

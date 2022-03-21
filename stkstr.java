import java.util.Scanner;

class node{
    char data;
    node next;
    node(char data){
        this.data = data;
    }
}


public class stkstr {
    node head;
    node tail;
    public boolean isEmpty(){
        if(tail==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(char x){
        node n = new node(x);
        if(tail == null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }
    public char peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return ' ';
        }
        else{
            return tail.data;
        }
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return ' ';
        }
        if(head.next==null){
            char a = head.data;
            head = null;
            tail = null;
            return a;
        }
        else{
            node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            char c = temp.next.data;
            tail = temp;
            temp.next = null;
            return c;
            
        }
    }
    public static void main(String[] args) {
        stkstr obj = new stkstr();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0;i<s.length();i++){
            obj.push(s.charAt(i));
        }
        for(int i = 0;i<s.length();i++){
            System.out.print(obj.pop()+"");
        }
    }
    
}

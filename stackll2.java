class node{
    node next;
    int data;
    node(int data){
        this.data = data;
    }
}


public class stackll2 {
    node head;
    node top;
    public void print(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void push(int x){
        node n = new node(x);
        if(head==null){
            head = n;
            top = n;
        }
        else if(head.next == null){
            head.next = n;
            top = n;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
            top = n;
        }
    }
    public int peek(){
        if(head==null){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return top.data;
        }
    }
    public int pop(){
        if(head==null){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            int x = top.data;
            node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            top = temp;
            temp.next = null;
            return x;
        }
    }
    
    
    public static void main(String[] args) {
        stackll2 s = new stackll2();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.print();
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }

    
}

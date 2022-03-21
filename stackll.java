class node{
    node next;
    int data;
    node(int data){
        this.data = data;
    }
}


public class stackll {
    node head;
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
        if(head == null){
            head = n;
        }
        else if(head.next==null){
            head.next = n;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    public int peek(){
        if(head==null){
            System.out.println("Empty stack");
            return -1;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            return temp.data;
                 
        }

    }
    public int pop(){
        if(head==null){
            System.out.println("Empty stack");
            return -1;
        }
        else{
            node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            int x = temp.next.data;
            temp.next = null;

            return x;
                 
        }

    }
    public static void main(String[] args) {
        stackll s = new stackll();
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

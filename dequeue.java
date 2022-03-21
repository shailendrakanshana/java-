class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}


public class dequeue {
    node head;
    node rear;
    public void print(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insertfront(int x){
        node n = new node(x);
        n.next = head;
        head = n;
    }
    public void insertrear(int x){
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
            rear = n;
        }
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    public int deletefront(){
        if(head==null){
            System.out.println("Dequeue is emepty");
            return -1;
        }
        else{
            int x = head.data;
            head = head.next;
            return x;
        }
    }

    public int deleterear(){
        if(head==null){
            System.out.println("Dequeue is Empty");
            return -1;
        }
        else if(head.next==null){
            int x = head.data;
            head = null;
            return x;
        }
        else{
            node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            int y = temp.next.data;
            rear = temp;
            temp.next = null;
            return y;
        }
    }
    public int getfront(){
        if(head==null){
            System.out.println("Dequeue is Empty");
            return -1;
        }
        else{
            return head.data;
        }
    }
    public int getrear(){
        if(head==null){
            System.out.println("Dequeue is Empty");
            return -1;
        }
        else{
            return rear.data;
        }
    }
    public static void main(String[] args) {
        dequeue d = new dequeue();
        d.insertfront(10);
        d.insertfront(20);
        d.insertfront(30);
        d.insertfront(40);
        d.print();
        d.insertrear(15);
        d.insertrear(25);
        d.insertrear(35);
        d.insertrear(45);
        d.print();
        System.out.println(d.deletefront());
        d.print();
        System.out.println(d.deleterear());
        d.print();
        System.out.println(d.getfront());
        System.out.println(d.getrear());
    }


    
}

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next = null;
    }
}


public class linkedlist1 {
    node head;
    public void print(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void insertAtbeg(int x){
        node n = new node(x);
        n.next = head;
        head = n;
    }
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
            //temp.next = n;
            //n.next = temp.next;
            temp.next = n;
            //temp = n;
        }

    }
    public int count(){
        node temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;

    }
    public void insertAtpos(int p , int x){
        node n = new node(x);
        if(head==null){
            if(p!=1){
                System.out.print("Invalid position");
            }
            else{
                head = n;
            }
        }
        else{
            if(p==1){
                n.next = head;
                head = n;
            }
            else if(p>count()+1){
                System.out.println("Invalid Position");
            }
            else{
                node temp = head;
                int c = 1;
                while(temp!=null){
                    if(c==p-1){
                        break;
                    }
                    else{
                        temp = temp.next;
                        c++;
                    }
                }
                n.next = temp.next;
                temp.next = n;

            }
        }
    }
    public void replace(int p,int x){
        node n = new node(x);
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            if(p==1){
                n.next = head.next;
                head = n;

            }
            else if(p>count()){
                System.out.println("Invalid position");
            }
            else{
                node temp = head;
                int c = 1;
                while(temp!=null){
                    if(c==p-1){
                        break;
                    }
                    temp = temp.next;
                    c++;
                }
                n.next = temp.next.next;
                temp.next = n;
            }
        }
    }
    public void deleteAtbeg(){
        if(head==null){
            return;
        }
        else{
            head = head.next;
        }

    }
    public void delete(int x){
        node temp = head;
        node dn = null;
        int c = 0;
        if(head == null){
            return;
        }
        else if(head.data==x){
            head = head.next;
            
        }
        else{
            while(temp!=null && temp.data!=x){
                dn = temp;
                temp = temp.next;

            }
            dn.next = temp.next;
        }
        

    }
    public void deleteAtpos(int p){
        if(head==null){
            return;
        }
        else{
            if(head.next==null){
                if(p!=1){
                    System.out.println("Invalid Position");
                }
                else{
                    head = null;
                }
            }
            else{
                if(p>count()){
                    System.out.println("Invalid Position");
                }
                else if(p==1){
                    head = head.next;
                }
                else{
                    node temp = head;
                    int c = 1;
                    while(temp!=null){
                        if(c == p-1){
                            break;
                        }
                        c = c +1;
                        temp = temp.next;
                    }
                    temp.next = temp.next.next;
                }
            }
        }
    }
    public static void main(String[] args) {
        linkedlist1 obj = new linkedlist1();
        node n1 = new node(10);
        obj.head = n1;
        node n2 = new node(20);
        n1.next = n2;
        node n3 = new node(30);
        n2.next = n3;
        obj.print();
        obj.insertAtbeg(15);
        System.out.println();
        obj.print();
        obj.insertAtend(50);
        System.out.println();
        obj.print();
        obj.insertAtpos(1, 45);
        System.out.println();
        obj.print();
        obj.replace(1, 56);
        System.out.println();
        obj.print();
        obj.delete(30);
        System.out.println();
        obj.print();
        obj.deleteAtpos(2);
        System.out.println();
        obj.print();

    }
    
}

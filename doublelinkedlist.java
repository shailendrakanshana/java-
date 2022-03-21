import java.util.*;

class node{
    node prev;
    int data;
    node next;
    node(int data){
        this.data = data;
    }

}


public class doublelinkedlist {
    node head;
    public void print(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void dinsertAtbeg(int x){
        node n = new node(x);
        if(head == null){
            head  = n;
        }
        else{
            n.next = head;
            head.prev = n;
            head = n;
        }
    }
    public void dinsertAtend(int x){
        node n = new node(x);
        if(head == null){
            head = n;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            n.prev = temp;
            temp.next = n;
        }
    }
    public int dcount(){
        int c = 0;
        node temp = head;
        while(temp!=null){
            c = c+1;
            temp = temp.next;
        }
        return c;
    }
    public void dinsertAtpos(int x,int p){
        node n = new node(x);
        if(head==null){
            if(p!=1){
                System.out.println("Invalid Position");
            }
            else{
                head = n;
            }
        }
        else{
            if(p==1){
                n.next = head;
                head.prev = n;
                head = n;
            }
            else if(p>dcount()+1){
                System.out.println("Invalid Position");
            }
            else{
                node temp = head;
                int c = 1;
                while(temp.next!=null){
                    if(p-1==c){
                        break;
                    }
                    c = c+1;
                    temp = temp.next;
                }
                if(p==dcount()+1){
                    n.next = temp.next;
                    n.prev = temp;
                    temp.next = n;

                }
                else{
                    n.next = temp.next;
                    n.prev = temp;
                    temp.next.prev = n;
                    temp.next = n;

                }
                

            }

        }
    }
    public void ddeleteatbeg(){
        if(head==null){
            return;
        }
        else if(head.next==null){
            head = null;
        
        }
        else{
            head.next.prev = null;
            head = head.next;
        }
    }
    public void ddeleteatend(){
        if(head==null){
            return;
        }
        else if(head.next==null){
            head = null;
        }
        else{
            node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void deletevalue(int x){
        if(head==null){
            return;
        }
        else if(head.next == null && head.data==x){
            head = null;
        }
        else if(head.next==null && head.data!=x){
            System.out.println("InVALID");
            return;

        }
        else{
            node temp = head;
            if(head.data==x){
                head = head.next;
                head.prev = null;
            }
            else{
                int f = 0;
                while(temp.next!=null && temp.next.data!=x){
                    temp = temp.next;
                    f++;
                }
                if(temp.data !=x){
                    System.out.println("Invalid data");

                }
                else if(temp.next.next==null){
                    temp.next = null;
                }
                else{
                    temp.next = temp.next.next;
                    temp.next.prev = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        doublelinkedlist obj = new doublelinkedlist();
        obj.dinsertAtend(10);
        obj.dinsertAtend(20);
        obj.dinsertAtend(30);
        obj.dinsertAtend(40);
        obj.dinsertAtpos(56, 5);
        obj.print();
        obj.ddeleteatend();
        obj.print();
        obj.deletevalue(60);
        obj.print();

        
    }

    
}

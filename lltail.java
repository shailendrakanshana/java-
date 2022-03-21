import java.util.Scanner;
class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data=data;
    }
}
public class lltail {
    Node4 head;
    Node4 tail;
    public void insert(int data){
        Node4 n=new Node4(data);
        if(tail==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void insertatbeg(int data){
        Node4 n=new Node4(data);
        if(tail==null){
            head=n;
            tail=n;
        }
        else{
            n.next=head;
            head=n;
        }
    }
    public void insertatanypos(int pos,int data){
        Node4 n=new Node4(data);
        if(tail==null){
            if(pos!=1){
                System.out.println("invalid position");
            }
            else{
                head=n;
                tail=n;
            }
        }
        else{
            if(pos==1){
                n.next=head;
                head=n;
            }
            else if(pos>count()+1){
                System.out.println("postion invalid");
            }
            else{
                Node4 temp=head;
                int c=1;
                while(temp!=null){
                    if(c==pos-1){
                        break;
                    }
                    c++;
                    temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
                
            }
        }
    }
    public void insertatlast(int data){
        Node4 n=new Node4(data);
        if(tail==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void dltatfirst(){
        if(tail==null){
            return;
        }
        else{
            head=head.next;
        }
    }
    public void dltinbt(int pos){
        if(tail==null){
            return;
        }
        else if(head.next==null){
            if(pos==1){
                head=null;   
            }
            else{
               System.out.println("invalid position"); 
            }
            
        }
        else if(pos>count()){
            System.out.println("invalid position");
        }
        else if(pos==1){
            head=head.next;
        }
        else{
            int c=1;
            Node4 temp=head;
            while(temp!=null){
                if(c==pos-1){
                    break;
                }
                c++;
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        
    }
    public void dltatlast(){
        if(tail==null){
            return;
        }
        else{
            
            tail=null;
        }
    }
    int count(){
        Node4 temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void print(){
        Node4 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        
    }
    public static void main(String args[]){
        lltail obj=new lltail();
        Scanner sc=new Scanner(System.in);
        System.out.println("etr no of ele");
        int num=sc.nextInt();
        System.out.println("entr ele");
        for(int i=0;i<num;i++){
            obj.insert(sc.nextInt());
        }
        obj.print();
        System.out.println();
//        obj.insertatbeg(40);
//        obj.print();
//        obj.insertatlast(50);
//        obj.print();
//        obj.insertatanypos(1,70);
//        obj.dltatfirst();
//        obj.print();
//        obj.dltatlast();
//        System.out.println("enter the position ");
        obj.dltinbt(sc.nextInt());
//        obj.dltbydata(sc.nextInt());
//        obj.searchnodebydata(sc.nextInt());
        obj.print();
    }
}
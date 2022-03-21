public class stack1 {
    static final int max = 1000;
    int ar[] = new int[max];
    int top;
    stack1(){
        top  = -1;
    }
    boolean isempty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isfull(){
        if(top>=(max-1)){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int x){
        if(isfull()){
            System.out.println("Stack Overflow");

        }
        else{
            top++;
            ar[top] = x;
        }
    }
    public int pop(){
        if(isempty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        else{
            int x = ar[top];
            top--;
            return x;
        }
    }
    public int peek(){
        if(isempty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        else{
            int x = ar[top];
            return x;
        }
    }
    public static void main(String[] args) {
        stack1 s = new stack1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
    
    
}

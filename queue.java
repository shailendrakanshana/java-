public class queue {
    static int front,rear,cap;
    static int q[];
    queue(int c){
        front  = 0;
        rear = 0;
        cap = c;
        q = new int[cap];
    }
    public boolean isEmpty(){
        if(rear==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(rear==cap){
            return true;
        }
        return false;
    }
    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else{
            q[rear] = x;
            rear++;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int x = q[front];
            for(int i = 0;i<rear-1;i++){
                q[i] = q[i+1];
            }
            rear--;
            return x;

        }
    }
    public int front(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return q[front];
    }
    public int rear(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return q[rear];
    }

    public static void main(String[] args) {
        queue q1 = new queue(4);
        System.out.println(q1.dequeue());
        q1.enqueue(10);
        q1.enqueue(20);
        q1.dequeue();
        q1.enqueue(30);
        q1.enqueue(40);
        q1.dequeue();
        System.out.println(q1.front());
        System.out.println(q1.rear());
        
    }
}

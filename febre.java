import java.util.*;

public class febre {
    public static int c  = 0,a = 0,b = 1;
    public void feb(int n){
        if(n==0){
            return;
        }
        else{
            c = a+b;
            a = b;
            b = c;
            System.out.print(" "+c);
            feb(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(a+" "+b);
        febre obj  = new febre();
        obj.feb(n-2);


    }
    
}

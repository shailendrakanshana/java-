import java.util.Scanner;

public class factre {
    public int fact(int n){
        
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 1;
        }
        else{
            return (n * fact(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factre obj = new factre();
        int n = sc.nextInt();
        System.out.print(obj.fact(n));
    }
    
}


import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();

        int c=a+b;
        int d=a*b;
        int m=a/b;
        int n=a-b;

        System.out.println("Adding: "+c);
        System.out.println("Subtracting: "+n);
        System.out.println("Multiplication: "+d);
        System.out.println("Division: "+m);
        
    }
    
}

package methods.palindrome;

import java.util.Scanner;

public class second_highest_alternate {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        range(a, b);

    }
    public static int reverse(int n){
        int s=0;
        while(n>0){
            int d=n%10;
             s=(s*10)+d;
            n/=10;
        }
        return s;
    }
    public static boolean isPalin(int n){
       
        return n==reverse(n);
    }

    public static void range(int a,int b){
        int c=0;
        int ac=0;
        for(int i=b;i>=a;i--){
            if(isPalin(i)){
                c++;
            if(c%2!=0){
                ac++;
            
            if(ac==2){
                System.out.println(i);
                break;
            }
        }
        }
        }
    }
}

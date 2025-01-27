package recursion;

import java.util.Scanner;

public class armstrong {

    public static boolean isArmstrong(int n,int c,int t,int s){
        if(n==0) return s==t ;
        s+=(int)Math.pow(n%10,c);
        return isArmstrong(n/10,c,t,s);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=(n+"").length();
        System.out.println(isArmstrong(n, c,n,0));
    }
    
}

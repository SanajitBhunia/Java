package recursion;

import java.util.Scanner;

public class spynumber {
    public static boolean isSpy(int n,int p,int s){
        if(n==0) return p==s;
        p*=n%10;
        s+=n%10;
        return isSpy(n/10, p, s);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        System.out.println(isSpy(n, 1, 0));
    }
    
}

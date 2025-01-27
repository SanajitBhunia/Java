package recursion;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalin(int n,int rev,int t){
        if(n==0) return rev==t;
        rev=rev*10+n%10;
        return isPalin(n/10,rev,t);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int n=sc.nextInt();
        System.out.println(isPalin(n,0,n));
    }
    
}

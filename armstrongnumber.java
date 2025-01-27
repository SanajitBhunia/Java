

import java.util.*;

class armstrongnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int m=n;
        int mm=n;
        int c=0;
        int sum=0;

        while(m>0){
           m/=10;
           c++; 
        }
        while(mm>0){
            int d=mm%10;
            sum+=(int)Math.pow(d, c);
            mm/=10;
        }
        if(sum==n){
            System.out.println(n+" is an armstrong number");
        }
        else{
            System.out.println(n+" is not an armstrong number");
        }
        
    }
    
}

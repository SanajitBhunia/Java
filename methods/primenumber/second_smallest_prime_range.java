package methods.primenumber;

import java.util.Scanner;

public class second_smallest_prime_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        range(a, b);

        
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
               
            }
        }
        return true;
    }
    public static void range(int a,int b){
        int c=0;
        for(int i=a;i<=b;i++){
            
            if(isPrime(i)){
              c++;
            }
            if(c==2){
                System.out.println(i);
                break;
            }
        }
    }
}

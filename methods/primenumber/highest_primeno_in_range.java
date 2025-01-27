package methods.primenumber;

import java.util.Scanner;

class highest_primeno_in_range {
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
        for(int i=b;i>=a;i--){
            if(isPrime(i)){
                System.out.println(i);
                break;
            }
        }
    }
}

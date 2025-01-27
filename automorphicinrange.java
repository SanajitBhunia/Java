
import java.util.Scanner;

public class automorphicinrange {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower range");
        int a=sc.nextInt();
        System.out.println("Enter higher range");
        int b=sc.nextInt();
        
        for(int i=a;i<=b;i++){
            int n=i;
            int nn=n*n;
            boolean flag=true;
            while(n>0){
                if(n%10!=nn%10){
                    flag=false;
                    break;
                }
                n/=10;
                nn/=10;
            }
            if(flag){
                System.out.println(i);
            }
        }

    }

    // public static boolean automorphic(int n){
    //     int nn=n*n;
    //     boolean flag=true;
    //     while(n>0){
    //         if(n%10!=nn%10){
    //             flag=false;
    //             break;
    //         }
    //         n/=10;
    //         nn/=10;
    //     }
    //     return  flag;
    // }
    
}

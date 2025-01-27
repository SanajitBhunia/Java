
import java.util.Scanner;

 class automorphicnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int t=n;
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
            System.out.println(t+" is a Automorphic number");
        }
        else{
            System.out.println(t+" is not a Automorphic number");
        }
    }
    
}

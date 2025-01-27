
import java.util.Scanner;



public class armstrongnuminrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower range");
        int a=sc.nextInt();
        System.out.println("Enter higher range");
        int b=sc.nextInt();

        for(int i=a;i<=b;i++){
            int d=i;
            int dd=i;
            int c=0;
            int sum=0;

            while(d>0){
                d/=10;
                c++;
            }
            while(dd>0){
                int dg=dd%10;
                sum+=Math.pow(dg,c);
                dd/=10;
            }
            if(sum==i){
                System.out.println(i);
            }

        }
        
    }
    
}

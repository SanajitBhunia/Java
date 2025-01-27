
import java.util.Scanner;

public class strongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower range");
        int st=sc.nextInt();
        System.out.println("Enter higher range");
        int end=sc.nextInt();
        for(int i=st;i<=end;i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                int rem=temp%10;
                int fact=1;
                for(int j=1;j<=d;j++){
                    fact*=j;
                }
                sum+=fact;
                temp/=10;
            }
            if(sum==i) System.out.println(i);
        }
    }
    
}


import java.util.Scanner;




public class primenumberinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower range");
        int a=sc.nextInt();
        System.out.println("Enter higher range");
        int b=sc.nextInt();
       
        for(int i=a;i<=b;i++){
            boolean f=true;
            if(i<=1) continue;;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    f=false;
                    break;
                }
            }
            if(f){
                System.out.println(i);
            }
        }
    }
    
}

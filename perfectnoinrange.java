
import java.util.Scanner;

 class perfectnoinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower range");
        int a=sc.nextInt();
        System.out.println("Enter higher range");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int n=i;
            int s=0;
            for(int j=1;j<=n/2;j++){
                if(n%j==0){
                    s+=j;
                }
            }
            if(s==n){
                System.out.println(i);
            }
        }
    }
}

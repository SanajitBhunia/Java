
import java.util.Scanner;

 class Diamondpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n%2==0) n+=1;

        int sp=n/2;
        int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n/2){
                sp--;
                st+=2;
            }else{
                sp++;
                st-=2;
            }

        }
    }
    
}

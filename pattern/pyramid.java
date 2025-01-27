import java.util.Scanner;

public class pyramid {
    public static void Pyramid(int n){
        int st=1;
        int sp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
           
            System.out.println();
            sp--;
            st+=2;
        }
    }
    public static void revPyramid(int n){
        int st=((n*2)-1);
        int sp=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
           
            System.out.println();
            sp++;
            st-=2;
        }
    }
    public static void hollowrevPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n*2-1;j++){
               if(i==1 || j==(n*2)-i ||i==j){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
           
            System.out.println();
           
        }
    }
    public static void hollowPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
               if(j==1 || j==i*2-1 ||i==n){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
           
            System.out.println();
           
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        Pyramid(n);
        System.out.println("------------------------");
        revPyramid(n);
        System.out.println("--------------------------");
        hollowrevPyramid(n);
        System.out.println("--------------------------");
        hollowPyramid(n);
    }
}

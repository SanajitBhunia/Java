import java.util.Scanner;

public class lefthalfpyramid {
    public static void leftHalfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void revleftHalfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        leftHalfpyramid(n);
        System.out.println("-----------------------------");
        revleftHalfpyramid(n);
    }

    
}

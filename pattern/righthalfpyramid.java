import java.util.Scanner;

public class righthalfpyramid {
      public static void rightHalfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //reverse right half pyramid
    public static void revrightHalfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        rightHalfpyramid(n);
        //System.out.println("-------------------------------------");
        revrightHalfpyramid(n);
    }
    
}

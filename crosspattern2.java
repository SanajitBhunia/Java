
    import java.util.Scanner;

public class crosspattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        char a='A';

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print(a++);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      
        
    }
}

    


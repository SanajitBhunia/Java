
import java.util.Scanner;

public class Snakepattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
      
        for(int i=1;i<=n;i++){
                if(i%2==0){
                    int kk=i*n;
                    for(int j=1;j<=n;j++){
                        System.out.print(kk+"\t");
                        kk--;
                    }
                   
                    
                }
                else{
                    int kk=(i*n)-(n-1);
                    for(int j=1;j<=n;j++){
                        System.out.print(kk+"\t");
                        kk++;
                    }
                    
                }
        
            System.out.println();
        }
    }
    
}

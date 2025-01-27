
import java.util.Scanner;




class primenumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n<=1) System.out.println(n+" is not a Prime number");
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println(n+" is not a Prime number");
            }
            else{
                System.out.println(n+" is Prime number");
            }
        }
    }
}

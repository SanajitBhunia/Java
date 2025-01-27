package String;

import java.util.Scanner;

public class string_to_int {

    public static int str_to_int(String S){
        int inte=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch>='0' && ch<='9'){
            int d=ch-'0';
            inte=(inte*10)+d;
            }
            
        }

        return inte;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.nextLine();
        System.out.println(str_to_int(s));
    }
    
}

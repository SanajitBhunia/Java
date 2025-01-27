package String;

import java.util.Scanner;
public class sumofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        String uc="";
        String lc="";
        String n= ""; 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                uc+=ch;
            }
            else if(ch>='a' && ch<='z'){
                lc+=ch;
            }
            else if(ch>='0' && ch<='9'){
                n+=ch;
            }
        }
        System.out.println(uc);
        System.out.println(lc);
        System.out.println(n);
        
    }
}

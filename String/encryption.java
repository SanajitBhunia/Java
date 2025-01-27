package String;

import java.util.Scanner;

public class encryption {
    public static String encode(String s,int n)
    {
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                res+=(char)(((ch+n-'A')%26+26)%26+'A');
            }
            else if(Character.isLowerCase(ch)){
                res+=(char)(((ch+n-'a')%26+26)%26+'a');
            }
        }
        return res;
    }

    public static String decode(String s, int n){
        return encode(s, -n);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        String eString=encode(s, n);
        System.out.println(eString);
        String dString=decode(eString, n);
        System.out.println(dString);
    }
    
}

package String;

import java.util.Scanner;

public class palinword {

    public static boolean isPalin(String s){
        int st=0;
        int end=s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)) return false;
           
                st++;
                end--;
            
        }
        return true;
    }

    public static void sub_string(String s){
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(isPalin(str[i])){
                System.out.println(str[i]);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sub_string(s);
    }

    
}

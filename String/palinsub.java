package String;

import java.util.Scanner;

public class palinsub {
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

    public static void sub_string(String S){
        for(int i=0;i<S.length();i++){
            for(int j=i+3;j<=S.length();j++){
                String str=S.substring(i,j);
                if(isPalin(str)){
                    System.out.println(str);
                }
            }
        }
    }
    public static String max_length_palin_sub_string(String S){
        int n=0;
        String ans="";
        for(int i=0;i<S.length();i++){
            for(int j=i+3;j<S.length();j++){
                String str=S.substring(i,j);
                if(isPalin(str)){
                    int size=str.length();
                    if(size>n){
                        n=size;
                        ans=str;
                        
                    }
                }
            }
        }
        System.out.println(n);
        return ans;

    }
    public static String min_length_palin_sub_string(String S){
        int n=S.length()-1;
        String ans="";
        for(int i=0;i<S.length();i++){
            for(int j=i+3;j<S.length();j++){
                String str=S.substring(i,j);
                if(isPalin(str)){
                    int size=str.length();
                    if(size<n){
                        n=size;
                        ans=str;
                        
                    }
                }
            }
        }
        System.out.println(n);
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        S=S.toLowerCase();
        sub_string(S);
        System.out.println("MAX: "+max_length_palin_sub_string(S));
        System.out.println("MIN:"+min_length_palin_sub_string(S));
    }
}

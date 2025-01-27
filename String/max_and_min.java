package String;

import java.util.Scanner;

public class max_and_min {
    
    public static String max_accurance(String S){
        String[] str=S.split(" ");
        String ans=" ";
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<str.length;i++){
            int count=1;
            if(str[i]==" ")continue;
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    count++;
                    str[j]=" ";
                }
            }
            if(count>mx){
                mx=count;
                ans=str[i];
            }
          
        }

        return  ans;
    }
    public static String min_accurance(String S){
        String[] str=S.split(" ");
        String ans=" ";
        int mx=Integer.MAX_VALUE;
        for(int i=0;i<str.length;i++){
            int count=1;
            if(str[i]==" ")continue;
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    count++;
                    str[j]=" ";
                }
            }
            if(count<mx){
                mx=count;
                ans=str[i];
            }
          
        }

        return  ans;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
       
        System.out.println("Maximum repeted word: "+max_accurance(str));
        System.out.println("Maximum repeted word: "+min_accurance(str));
    }
}

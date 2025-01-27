package String;

import java.util.Scanner;

public class assignment {

    public static String convert(String s){
        char ch[]=s.toCharArray();
        String ans="";
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(c>'0' && c<='9'){
                int count = c - '0';
                while(count>1){
                    ans+=ch[i-1];
                    count--;
                }
            }else{
                ans+=c;
            }
        
    }
        

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(convert(s));
    }
    
}

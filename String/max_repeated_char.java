package String;

import java.util.Scanner;

public class max_repeated_char {

    public static char max_repeated(String s){
      char[] ch=  s.toCharArray();
        char ans=' ';
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<ch.length;i++){
            int count=1;
            if(ch[i]==' ') continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]=' ';
                }
            }
            if(count>mx){
                mx=count;
                ans=ch[i];
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any String");
        String s=sc.nextLine();

        System.out.println(max_repeated(s));

    }
    
}

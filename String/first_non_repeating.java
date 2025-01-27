package String;

import java.util.*;

public class first_non_repeating {
   

    public static char non_repeated(String s){
      char[] ch=  s.toCharArray();
        char ans=' ';
        for(int i=0;i<ch.length;i++){
            int count=1;
            if(ch[i]==' ') continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]=' ';
                }
            }
            if(count==1){
                ans=ch[i];
                break;
            }
            

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any String");
        String s=sc.nextLine();

        System.out.println(non_repeated(s));

    }
    
}



package String;

import java.util.Scanner;

public class second_max {
    public static char second_max_repeated(String s){
        char[] ch=  s.toCharArray();
          char mxChar=' ';
          char mxChar2=' ';
          
          int mx=Integer.MIN_VALUE;
          int mx2=Integer.MIN_VALUE;
          for(int i=0;i<ch.length;i++){
              int count=1;
              if(ch[i]=='\u0000') continue;
              for(int j=i+1;j<ch.length;j++){
                  if(ch[i]==ch[j]){
                      count++;
                      ch[j]='\u0000';
                  }
              }
              if (count > mx) {
                mx2 = mx;
                mxChar2=mxChar;

                mx = count;
                mxChar = ch[i];
                
            } else if (count > mx2 && count!=mx) {
                mx2 = count;
                mxChar2 = ch[i];
            }
              
  
          }
          System.out.println(mxChar+" - "+mx);
          System.out.println(mxChar2+" - "+mx2);
  
          return mxChar2;
      }
    
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");
        String str=sc.nextLine();
        System.out.println(second_max_repeated(str));
    }
}

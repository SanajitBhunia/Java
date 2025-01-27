package String;

import java.util.Scanner;

public class second_min {
     public static char second_max_repeated(String s){
        char[] ch=  s.toCharArray();
          char minChar=' ';
          char minChar2=' ';
          
          int min=Integer.MAX_VALUE;
          int min2=Integer.MAX_VALUE;
          for(int i=0;i<ch.length;i++){
              int count=1;
              if(ch[i]=='\u0000') continue;
              for(int j=i+1;j<ch.length;j++){
                  if(ch[i]==ch[j]){
                      count++;
                      ch[j]='\u0000';
                  }
              }
              if (count < min) {
                min2 = min;
                minChar2=minChar;

                min = count;
                minChar = ch[i];
                
            } else if (count < min2 && count!=min) {
                min2 = count;
                minChar2 = ch[i];
            }
              
  
          }
          System.out.println(minChar+" - "+min);
          System.out.println(minChar2+" - "+min2);
  
          return minChar2;
      }
    
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");
        String str=sc.nextLine();
        System.out.println(second_max_repeated(str));
    }
}

package String;

import java.util.Scanner;

public class arrange_char {
    public static String sortByAscii(String s) {
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        
        return new String(ch);
    }

      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");
        String str=sc.nextLine();
        System.out.println(sortByAscii(str));
    }
    
}

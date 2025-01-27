package String;

import java.util.Scanner;

public class words_count {
    public static int word_count(String s){
        char[] ch=s.toCharArray();
        int count=1;
        for(int i=1;i<ch.length;i++){
            if(ch[i]!=' ' && ch[i-1]==' '){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        System.out.println(word_count(s));
    }
}

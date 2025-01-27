package String;

import java.util.Scanner;

public class ReplaceConsecutiveCharacters {

    public static String consecutive(String s){
        char[] ch=s.toCharArray();
        String ans=""+ch[0];
        for(int i=1;i<ch.length;i++){
            if(ch[i]==ch[i-1]){
                ch[i]='$';
            }

            ans+=ch[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       System.out.println(consecutive(input));
    }
}

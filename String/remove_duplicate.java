package  String;

import java.util.Scanner;

public class remove_duplicate {

    public static String remove_dupl(String S){
        String[] str=S.split(" ");
        String ans=" ";
        for(int i=0;i<str.length;i++){
            if(str[i].equals(" "))continue;
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    str[j]=" ";
                }
            }
            if(i<str.length-1)
            ans+=str[i]+" ";
            else{
                ans+=str[i];
            }
          
        }

        return  ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");
        String str=sc.nextLine();
        System.out.println(remove_dupl(str));
    }
}
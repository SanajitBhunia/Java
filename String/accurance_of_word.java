package String;

import java.util.Scanner;

public class accurance_of_word {

    public static void accurance_word(String S){
        String[] str=S.split(" ");
        for(int i=0;i<str.length;i++){
            int count=1;
            if(str[i]==" ")continue;
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    count++;
                    str[j]=" ";
                }
            }
            System.out.println(str[i]+" : "+count);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
        accurance_word(str);
    }
}

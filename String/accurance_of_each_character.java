package String;

import java.util.Scanner;

public class accurance_of_each_character {

    public static void accurance(String s){
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count=1;
            if(ch[i]==' ') continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]=' ';
                }
            }
            System.out.println(ch[i]+"="+count);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any String");
        String s=sc.nextLine();

        accurance(s);


    }
    
}

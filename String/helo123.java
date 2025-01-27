package String;

public class helo123 {

    public static String change_the_word(String s){
        char[] ch=s.toCharArray();
        String str="";
        for(int i=0;i<ch.length;i++){
            int c=1;
           
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    c++;
                    System.out.println(chh);
                   
            }
        }

         
        }

        return str;
    }

    public static void main(String[] args) {
        String s="Hello World";
       System.out.println( change_the_word(s));
    }
    
}

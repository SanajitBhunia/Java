package String;

public class consecutive2 {
    public  static String consecutive_count(String S){
        char ch[]=S.toCharArray();
        String str=" "+ch[0];
        int count=1;
        for(int i=1;i<ch.length;i++){
            if (ch[i] == ch[i - 1]) {
                count++;
            } else {
                // Append the count if greater than 1 before moving to the next character
                if (count > 1) {
                    str += count;
                }
                str += ch[i]; // Append the current character
                count = 1; // Reset count for the new character
            }
        }

        return str;
    }

    public static void main(String[] args) {
        String input = "aabbccdecf";
        System.out.println(consecutive_count(input));
    }
    
}

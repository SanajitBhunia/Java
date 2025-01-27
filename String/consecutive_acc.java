package String;

public class consecutive_acc {
    public static void main(String[] args) {
        String input = "aabbccdecf";
        System.out.println(countConsecutiveChars(input));
    }

    public static String countConsecutiveChars(String s) {
        String result = "";
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result = result + s.charAt(i - 1);
                if (count > 1) {
                    result = result + count;
                }
                count = 1;
            }
        }

        // Handle the last character or sequence
        result = result + s.charAt(s.length() - 1);
        if (count > 1) {
            result = result + count;
        }

        return result;
    }
}

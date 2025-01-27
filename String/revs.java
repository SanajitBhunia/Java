package String;
public class revs {

    public static String revs(String str){
        int n=str.length();
        String ans="";
        for(int i=n-1;i>=0;i--){
            ans+=str.charAt(i);
        }

        return ans;
    }    

    public static void main(String[] args) {
        String str="java is easy";
        String[] ans=str.split(" ");
        for(int i=0;i<ans.length;i++){
            String st=ans[i];
            ans[i]=revs(st);
        }

        for(int i=ans.length-1;i>=0;i--){
            System.out.print(ans[i]+" ");
        }


    }
}

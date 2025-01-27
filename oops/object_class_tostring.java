package oops;



public class object_class_tostring {
    int i;
    int j;
    public object_class_tostring(int i,int j){
        this.i=i;
        this.j=j;
    }
 
    @Override
    public String toString(){
        return i+" "+j;
    }
    public static void main(String[] args) {
         object_class_tostring a=new object_class_tostring(10, 20);
         System.out.println(a.toString());
         object_class_tostring b=new object_class_tostring(10, 20);
         System.out.println(b.toString());
         System.out.println(b);
         System.out.println(a.equals(b));
    }
}

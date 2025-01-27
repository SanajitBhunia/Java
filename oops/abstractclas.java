package oops;

abstract class AA{
    int i=10;
    int j=10;

    public AA() {
        System.out.println("AA() constructor");
    }

    abstract  void m1();
    
}

class BB extends AA{
    int i=30;
    int j=40;
     public BB(){
        System.out.println("BB()-cons");
     }
     @Override
     void m1(){
        System.out.println("M1-BB");
     }
}
public class abstractclas {
   public static void main(String[] args) {
    AA a=new BB();
    System.out.println(a.i+","+a.j);
    a.m1();
   }
    
    
}

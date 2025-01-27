package oops;


abstract class A{
    abstract public void m1();
    abstract public void m2();
}

abstract class B extends A{
    @Override
    public void m1(){
        System.out.println("M1()-B");
    }

    abstract public void m3();
}

class C extends B{
    @Override
    public void m2(){
        System.out.println("M2()-C");
    }
    @Override
    public void m3(){
        System.out.println("M3()-C");
    }
}


public class abstractclass2 {
    public static void main(String[] args) {
       // A a=new B();
        A a1=new C();
        a1.m1();
        a1.m2();
        //a1.m3();
        // B b1=new B();
        // b1.m1();
        // b1.m2();
        // b1.m3();

    }
}

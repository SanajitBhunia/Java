package oops;

abstract class Animal{
    public abstract void makesound();
}

class dog extends Animal{
   public void makesound(){
       System.out.println("DOGGG");
   }
}

class Cat extends Animal{
   public void makesound(){
       System.out.println("CATT");
   }
}



public class A{
   public static void main(String[] args) {
       dog d=new dog();
       d.makesound();
       Cat c1=new Cat();
       c1.makesound();
   }
}





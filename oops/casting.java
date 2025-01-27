package oops;

class Animal{
    void eat(){
        System.out.println("Animal Eating");
    }

}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog Eating");
    }
    void bark(){
        System.out.println("Barking");
    }
}
class BabyDog extends Dog{
    @Override
    void eat(){
        System.out.println("Babydog Eating");
    }

    void weep(){
        System.out.println("Weeping..");
    }
}

class cat extends Dog{
    void sound(){
        System.out.println("Mew....");
    }
}

public class casting {
    public static void main(String[] args) {
        Animal a1=new Dog();//Upcasting
        a1.eat();
       Dog d1=(Dog) a1;
       d1.bark();
       d1.eat();
       Dog d2=new BabyDog();
       d2.eat();
      // d2.weep();

      BabyDog b1=(BabyDog) d2;
      b1.weep();

      Animal c=new cat();
      System.out.println("===========");
      c.eat();
      //c.sound();

      cat c1=(cat) c;
      c1.sound();
    }
}

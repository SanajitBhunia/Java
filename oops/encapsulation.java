package oops;

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    
    public void setAge(int age){
        this.age=age;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class encapsulation {

    public static void main(String[] args) {
        Person p=new Person("Akash",24);
        p.display();
        p.setAge(30);
        p.setName("Abinash");
        System.out.println("=============================");
        p.display();
    }
    
}

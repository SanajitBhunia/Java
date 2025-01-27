package oops;

abstract class Shape{
    String color;
    public Shape(String color){
        this.color=color;
    }
    abstract public void area();
    public abstract void display();
}

class Rectangle extends Shape{
    int length;
    int breadth;;

    public Rectangle(String color, int length,int breadth){
            super(color);
            this.length=length;
            this.breadth=breadth;
    }
    @Override
    public void area(){
        System.out.println(length*breadth);
    }

    @Override
    public void display(){
        System.out.println("Color: "+color);
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }

    public void perimeter(){
        int res=2*(length+breadth);
        System.out.println("res");
    }
}

class Circle extends Shape{
    int radious;

    public Circle(String color,int radious){
        super(color);
        this.radious=radious;
    }
    @Override
    public void area(){
        double res=3.14*(radious*radious);
        System.out.println(res);

    }
    @Override
    public void display(){
        System.out.println("Color: "+color);
        System.out.println("Radious: "+radious);
        
    }

}


public class abstraction_using_abstract_class {
   public static void main(String[] args) {
    Shape s;
    s=new Rectangle("Red",10,10);
    s.area();
    s.display();
    // s.perimeter();
    s=new Circle("Black",20);
    s.area();
    s.display();
   } 
}

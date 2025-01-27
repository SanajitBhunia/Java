package oops;



interface Shape{
    void getArea();
    void display();
}

class Circle implements Shape{
     int radious;
    
    public Circle(int radious){
        this.radious=radious;
    }
    @Override
    public void getArea(){
        double res=3.14*(radious*radious);
        System.out.println(res);
    }
    @Override
    public void display(){
        System.out.println("It is a Circle with radious: "+radious);
    }
}

class Rectangle implements Shape{
    private int length;
    private int breadth;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void getArea(){
        int  res=length*breadth;
        System.out.println(res);
    }
    @Override
    public void display(){
        System.out.println("It is a Ractangle:");
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }

}

public class abstraction_using_interface2 {
    public static void main(String[] args) {
        Shape S;
        S=new Circle(10);
        S.getArea();
        S.display();
        S=new Rectangle(10,20);
        S.getArea();
        S.display();
    }
    
}

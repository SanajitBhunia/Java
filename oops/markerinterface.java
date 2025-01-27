package oops;

public interface washable {

    // marker interface
}

class car implements washable{

}

class Mobile{
    
}
class Laptop{
    
}
class bike implements washable{
    
}

class washman{
    static void wash(Object o){
        if(o instanceof washable){
            System.out.println(o.getClass().getSimpleName()+" is washed");
        }
        else{
            System.out.println(o.getClass().getSimpleName()+" is not washed"); 
        }
    }
}

public class markerinterface {
    public static void main(String[] args) {
        bike b=new bike();
        car c=new car();
        Laptop l=new Laptop();

        washman.wash(l);
        washman.wash(b);
        washman.wash(c);
    }
}

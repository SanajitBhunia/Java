package oops;

import java.util.Scanner;

interface Car{
    void start();
    void stop();
}

class Bmw implements Car{

    @Override
    public void start() {
       System.out.println("BMW Started");
    }

    @Override
    public void stop() {
        System.out.println("BMW Stoped");
    }

    void autopilot(){
        System.out.println("BMW autopilot");
    }
    
}

class Thar implements Car{

    @Override
    public void start() {
        System.out.println("Thar Started");
    }

    @Override
    public void stop() {
        System.out.println("Thar Stopped");
    }

    void abs(){
        System.out.println("Thar ");
    }
    
}

class CarSelector{
    public static Car getCar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.BMW");
        System.out.println("2.Thar");
        System.out.println("Select Car");
        int n=sc.nextInt();
        if(n==1){
            return new Bmw();
        }
        else if(n==2){
            return new Thar();
        }
        else{
            return null;
        }
        
    }
}

public class abstraction_using_interface {
    
    public static void main(String[] args) {
        Car selectedCar=CarSelector.getCar();

        if(selectedCar!=null){
            selectedCar.start();
            selectedCar.stop();

            if(selectedCar instanceof Bmw){
                ((Bmw)selectedCar).autopilot();
            }
            else if(selectedCar instanceof Thar){
                ((Thar)selectedCar).abs();
            }
        }
        else{
            System.out.println("No Car Selected");
        }
    }
}

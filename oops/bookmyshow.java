package oops;



public class Theater{
    int seats=50;
    static private Theater t;
    private Theater(){
        
    }

    public static Theater getIns(){
        if(t==null){
            t=new Theater();
            return t;
        }
        else{
            return t;
        }
    }

    public void bookTicket(int n){
        if(n<=seats){
            System.out.println(n+"Seats booked");
            seats-=n;
            System.out.println(seats+" is available");
        }
        else{
            System.out.println("Seats is not availabe");
        }
    }
    
}

public class bookmyshow {
    public static void main(String[] args) {
        Theater t1=Theater.getIns();
        t1.bookTicket(5);
    }
}

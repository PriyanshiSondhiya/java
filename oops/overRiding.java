package oops;
class Vehicle{
    void run(){
        System.out.print("run");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("run2");
        //super keyword call parent
        super.run();
    }
}




public class overRiding {
    public static void main(String args[]){
    Vehicle vh = new Bike();
    vh.run();
    }
}

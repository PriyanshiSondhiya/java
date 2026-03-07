package oops;


interface Walkable{
    void walk();
    void run();
}

interface Run{
    void walk();
    void run();
}

class Human implements Walkable, Run{
    public void walk(){
        System.out.println("Walkinggggg");
    }

    public void run(){
        System.out.println("Runss");
    }
}

public class question1 {
    public static void main(String args[]){
    Human obj = new Human();
    obj.run();
    obj.walk();
    }
}

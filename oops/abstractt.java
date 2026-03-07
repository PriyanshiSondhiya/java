package oops;
abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("sounds");
    }
}


class Cat extends Animal{
    void sound(){
        System.out.println(" sound");
    }
}



public class abstractt {
   public static void main(String args[]){ 
   Animal a1=new Dog();
   a1.sound();
   Animal a2= new Cat();
   a2.sound();
   }
}

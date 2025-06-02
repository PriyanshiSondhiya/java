package oops;
abstract class Shape{
 abstract void area();
}


class Circle extends Shape{
    float r=5;
    void area(){
    System.out.println(3.14*r*r);
    }
}

class Rectangle extends Shape{
    int l=2, b=3;
    void area(){
        System.out.println(l*b);
    }
}

public class abstractttt {
public static void main(String args[]){
Shape s1 = new Circle();
s1.area();

Shape s2= new Rectangle();
s2.area();
}
}

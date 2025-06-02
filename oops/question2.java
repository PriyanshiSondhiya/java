package oops;
interface A{
void display();
}

interface B{
void display();
}

class Demo implements A,B{
    public void display(){
        System.out.print("Priyanshi");
    }
}


public class question2 {
    public static void main(String args[]){
    Demo obj=new Demo();
    obj.display();
    }
}

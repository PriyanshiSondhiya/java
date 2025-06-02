package oops;
interface Client{
    void print();
    void show();
}

class Dev implements Client{
public void print(){
    System.out.println("print the bill");
}

public void show(){
    System.out.println("Show the menu");
}
}




public class interfacess {
    public static void main(String args[]){
        Dev obj= new Dev();
        obj.print();
        obj.show();
    }
}

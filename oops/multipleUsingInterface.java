package oops;
interface Client{
    void show();
}

interface Client2{
    void show();
}

class Dev implements Client, Client2{
    public void show(){
        System.out.println("common feature");
    }
}


public class multipleUsingInterface {
    public static void main(String args[]){
    Dev obj=new Dev();
    obj.show();
    }
}

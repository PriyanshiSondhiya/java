package oops;
abstract class Payment{
    abstract void pay(int a);
    void success(){
        System.out.println("payment done");
    }
}


class UpiPayment extends Payment{
    void pay(int a){
        System.out.println("pay via netbanking"+ a);
    }
}


class NetBanking extends Payment{
    void pay(int b){
        System.out.println("pay via netbanking"+b);
    }
}


public class abstractClass {
    public static void main(String args[]){
    Payment obj= new UpiPayment();
    obj.pay(25000);
    obj.success();

    Payment obj1=new NetBanking();
    obj1.pay(51000);
    obj1.success();
    }
}

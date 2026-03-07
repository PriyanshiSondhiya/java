package oops;
class Hello{
    void data(){
        {
            System.out.println(this);
        }
    }
}




public class thisRef {
    public static void main(String args[]){
    Hello obj= new Hello();
    obj.data();
    System.out.println();
    }
}

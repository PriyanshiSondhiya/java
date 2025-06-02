package oops;
class Parent{
    void sum(int a){
        System.out.println("mai hu don"+ " " +a);
    }
  void sum(int a,int b){
    System.out.println(a+b);
  }

   void sum(int a,int b,int c){
    System.out.println(a+b+c);
  }
}

 public class methodoverloading {
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.sum(420);
        obj.sum(420,20);
        obj.sum(420,20,30);
    }
    
}

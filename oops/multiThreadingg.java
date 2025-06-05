public class multiThreadingg {
   public static void main(String args[]){
    System.out.println("idher dekho");
    Thread t1= new Thread(()->{
    System.out.println("hello");
    });

    Thread t2= new Thread(()->{
        System.out.println("heeeeee");
    });

    t1.start();
    t2.start();
   } 
}

// public class multiThreadingg {
//    public static void main(String args[]){
//     System.out.println("idher dekho");
//     Thread t1= new Thread(()->{
//     System.out.println("hello");
//     });

//     Thread t2= new Thread(()->{
//         System.out.println("heeeeee");
//     });

//     t1.start();
//     t2.start();
//   }
//}




// class MyThread extends Thread{
//     public void run(){
//         for(int i=1; i<=10; i++){
//             System.out.println(getName() + "is running with priority");
//             Thread.yield();
//         }
//     }
// }

// public class multiThreadingg{
//     public static void main(String args[]){
//     MyThread t1= new MyThread();
//     MyThread t2= new MyThread();

//     t1.setName("Low Priority Thread");
//     t2.setName("Low Priority Thread");

//     t1.setPriority(Thread.MIN_PRIORITY);
//     t2.setPriority(Thread.MAX_PRIORITY);

//     t1.start();
//     t2.start();
//     }
// }



public class multiThreadingg {

    private boolean isSignalled = false;

    public synchronized void sendSignal() {
        isSignalled = true;
        System.out.println("Producer: Sending signal...");
        notify();
    }

    public synchronized void waitForSignal() {
        while (!isSignalled) {
            try {
                System.out.println("Consumer: Waiting for signal...");
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Consumer: Got the signal! Proceeding...");
    }

    public static void main(String[] args) {
        multiThreadingg obj = new multiThreadingg();

        Thread consumer = new Thread(() -> {
            obj.waitForSignal();
        });

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            obj.sendSignal();
        });

        consumer.start();
        producer.start();
    }
}
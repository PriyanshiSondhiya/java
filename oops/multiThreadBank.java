// class withdrawThread extends Thread{
//     static int totalBalance=1000;
//     int amount;

//     withdrawThread(int amount){
//         this.amount=amount;
//     }

//     public void run(){
//         if(totalBalance >=amount){
//             System.out.println("paisa aapke pass aa jayga kripaya prateeksha karein" + amount);

//             try{
//                 Thread.sleep(1000);
//             }catch (InterruptedException e){
//                 //TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//             totalBalance-=amount;
//             System.out.println(totalBalance);
//         }
//         else{
//             System.out.println("Insuffient Balance");
//         }
//     }
// }


// public class multiThreadBank {
//     public static void main(String args[]){
//     withdrawThread obj= new withdrawThread(800);
//     withdrawThread obj2= new withdrawThread(500);
//     obj.start();
//     obj2.start();

//     }
// }


//****solution */
// class withdrawThread extends Thread{
//     static int totalBalance=1000;
//     int amount;

//     withdrawThread(int amount){
//         this.amount=amount;
//     }

//     public void run(){
//         if(totalBalance >=amount){
//             System.out.println("paisa aapke pass aa jayga kripaya prateeksha karein" + amount);

//             try{
//                 Thread.sleep(1000);
//             }catch (InterruptedException e){
//                 //TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//             totalBalance-=amount;
//             System.out.println(totalBalance);
//         }
//         else{
//             System.out.println("Insuffient Balance");
//         }
//     }
// }


// public class multiThreadBank {
//     public static void main(String args[]){
//     withdrawThread obj= new withdrawThread(800);
//     withdrawThread obj2= new withdrawThread(500);
//     obj.start();
   
//     try{
//         obj.join();
//     }catch(InterruptedException e){
//         e.printStackTrace();
//     }
//     obj2.start();

//     }
// }



// public class multiThreadBank {
//     public static void main(String args[]){
//     withdrawThread obj= new withdrawThread(800);
//     withdrawThread obj2= new withdrawThread(500);
//     obj.start();
//     obj2.start();

//     }
// }


//****solution */
class withdrawThread extends Thread{
    static int totalBalance=1000;
    int amount;

    withdrawThread(int amount){
        this.amount=amount;
    }

    public void run(){
        synchronized(withdrawThread.class){
         if(totalBalance >=amount){
            System.out.println("paisa aapke pass aa jayga kripaya prateeksha karein" + amount);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
            totalBalance-=amount;
            System.out.println(totalBalance);
        }
        else{
            System.out.println("Insuffient Balance");
        }
        }
       
    }
}


public class multiThreadBank {
    public static void main(String args[]){
    withdrawThread obj= new withdrawThread(800);
    withdrawThread obj2= new withdrawThread(500);
    obj.start();
    obj2.start();

    }
}

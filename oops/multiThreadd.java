// class FileDownload extends Thread{
//     String fileName;

//     public FileDownload(String fileName){
//         this.fileName=fileName;
//     }

//     public void run(){
//         for(int i=1; i<=5; i++){
//             System.out.println(fileName + " " + "downloading...." + (i*20) + "%");
//             try{
//                 Thread.sleep(2000);
//             }catch(Exception e){

//             }
//         }
//     System.out.println(fileName + "done");
// }
// }

// class multiThreadd{
//     public static void main(String args[]){
//         FileDownload t1= new FileDownload("File A");
//         FileDownload t2= new FileDownload("File B");
//         FileDownload t3= new FileDownload("File C");
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }



//****2nd method of multithreading */
class MyRunnable implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName()+"hii");
    }
}

class multiThreadd{
    public static void main(String args[]){
        MyRunnable obj= new MyRunnable();
        Thread t1= new Thread(obj);
        t1.start();
    }
}
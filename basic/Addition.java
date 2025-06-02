package basic;
 class Add{
    int sum(int a, int b){
     return a+b;
    }
 
    int sum(int a,  int b, int c){
     return a+b+c;
    }
 
    double sum(double a, double b){
     return a+b;
    }
 }
 
 
 public class Addition{
 public static void main(String args[]){
     Add add= new Add();
     System.out.println(add.sum(1,2));
     System.out.println(add.sum(1,2,3));
     System.out.println(add.sum(1,2));
 
 }
 }
 
 
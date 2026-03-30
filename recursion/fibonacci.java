public class fibonacci {
  public static int print (int n){
    if(n <= 1){
      return n;
    }
    else{
      int last = print(n-1);
      int sLast = print(n-2);
      return last + sLast;
    }
  }

  public static void main (String args[]){
    System.out.println(print(3));
  }
}

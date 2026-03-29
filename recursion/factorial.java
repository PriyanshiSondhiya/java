public class factorial {
  public static int print (int n){
    if(n == 1){
      return 1;
    }else{
      return n * print(n-1);
    }
  }

  public static void main (String args[]){
   System.out.println( print(5));
  }
}

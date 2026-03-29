public class sumOfOneTwoNFunctional {
  public static int print(int n){
    if(n == 0){
      return 0 ;
    }else{
      return n + print(n-1);
    }
  }
  public static void main (String args[]){
     System.out.println(print(5));
  }
}

public class oneToNLinearly {
  public static void print(int i, int n){
    if(i < 1){
      return;
    }else{
      print(i-1, n);
      System.out.println(i);
    }
  }

  public static void main (String args[]){
    print(5, 5);
  }
}

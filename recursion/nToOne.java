

public class nToOne {
  public static void print(int i, int n){
    if(i<1){
      return;
    }
    else{
      System.out.println(i);
      print(i-1, n);
    }
  }

  public static void main(String args[]){
    print(5, 5);
  }
  
}

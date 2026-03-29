//parameterised

public class sumOfOneTwoN {
  public static void print (int i , int sum){
  if(i < 1){
    System.out.println(sum);
    return;
  }else{
     print(i-1, sum + i);
  }
  }

  public static void main (String args[]){
    print(5, 0);
  }
}

public class printName {
  public static void print (int i, int n){
      if(i > n){
        return;
      }
      else{
        System.out.println("Priyu");
        print(i+1, n);
      }
  }

  public static void main (String args[]){
print(1, 5);
  }
}

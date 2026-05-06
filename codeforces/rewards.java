import java.util.*;

public class rewards {
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
   int cup = sc.nextInt() + sc.nextInt() + sc.nextInt();
    int medal = sc.nextInt() + sc.nextInt() + sc.nextInt();
    int n = sc.nextInt();
   
    
    int shelf = (cup + 4)/5 + (medal + 9)/ 10;
    if(shelf <= n){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}

import java.util.*;

public class multiplicationTable {
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    long n = sc.nextLong();
    long x = sc.nextLong();

    int count = 0;

    for(int i=1; i<=n; i++){
      if(x%i == 0){
        long j = x/i;

        if(j<=n)count++;
      }

      
    }
    System.out.println(count);

  }
}

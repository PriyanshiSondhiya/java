import java.util.*;

public class worms {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int pile[] = new int[n+1];
    for(int i=1; i<=n; i++){
      pile[i] = sc.nextInt();
    }

    int m = sc.nextInt();
    int juicyWorm[] = new int[m+1];
    for(int i=1; i<=m; i++){
      juicyWorm[i] = sc.nextInt();
    }

    int prefix[] = new int[n+1];
     
    prefix[1] = pile[1];
    for(int i=2; i<=n; i++){
       prefix[i] = prefix[i-1] + pile[i];
    }

    
     
    
      for(int i=1; i<=m; i++){
        int q = juicyWorm[i];
        for(int j=1; i<=n; j++){
          if(prefix[j] >= q ){
          System.out.println(j);
          break;
        }
          
        }
      }
       
   
  }
}

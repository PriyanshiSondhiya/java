import java.util.*;

public class rewards {
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
  
    int cup = 0;
    int medal = 0;
    int arr[] = new int[a]; 
    int brr[] = new int[b];

    for(int i=0; i<a; i++){
      arr[i] = sc.nextInt();
      cup += arr[i];
    }

    for(int i=0; i<b; i++){
      brr[i] = sc.nextInt();
      medal+= brr[i];
    }
    
    int shelf = (cup + 4)/5 + (medal + 9)/ 10;
    if(shelf <= n){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}

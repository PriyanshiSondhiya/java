import java.util.*;

public class drinks {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    double sum = 0;
    for(int i=0; i<n; i++){
      sum += arr[i];
    }

    double ans = sum/n;
    System.out.println(ans);
  }
}

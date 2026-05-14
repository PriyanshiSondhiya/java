import java.util.*;

public class littleElephantAndRodzill {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n+1];

    for(int i=1; i<=n; i++){
      arr[i] =  sc.nextInt();
    }
    int ind = 0;
    int min = Integer.MAX_VALUE;
    for(int i=1; i<=n; i++){
      if(arr[i] < min){
        min = arr[i];
        ind = i;
      }
    }
    boolean duplicate = false;
    for(int i=ind+1; i<=n; i++){
        if(arr[i] == min){
           duplicate = true;
           break;
        }
      }

      if(duplicate == true){
         System.out.println("Still Rozdil");
      }else{
        System.out.println(ind);
      }
     
  }
}

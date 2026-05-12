import java.util.*;

public class football {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer>map = new HashMap<>();

    int n = sc.nextInt();
    String arr[] = new String[n];
    for(int i=0; i<n; i++){
       arr[i] = sc.next();
    }

    for(int i=0; i<n; i++){
      map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
    }
    
    int max = 0;
    String ans = "";
    for(String key: map.keySet()){
       if(map.get(key) > max){
        max = map.get(key);
        ans = key;
       }
    }
    System.out.println(ans);
  }
}

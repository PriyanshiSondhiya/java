import java.util.*;

public class arraySubst {
  public static void main (String args[]){
    int a[] = {1, 2, 3,4 ,5 ,6};
    int b[] = {1, 2, 3, 8};

    HashMap<Integer, Integer>map = new HashMap<>();

    for(int element : a){
      map.put(element, map.getOrDefault(element, 0) + 1);
    }
    
    boolean subset = true;
    for(int element: b){
      if(map.containsKey(element) && map.get(element)>0){
        map.put(element, map.get(element)-1);
      }else{
        subset = false;
        break;
      }
    }

    if(subset == false){
      System.out.println("not subset");
    }
    else{
      System.out.println("subset");
    }
  }
}

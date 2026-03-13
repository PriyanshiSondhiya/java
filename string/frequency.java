import java.util.*;

public class frequency {
  public static void main (String args[]){
    String freq = "banana";

    HashMap<Character, Integer> map = new HashMap<>();

    for(char c: freq.toCharArray()){
      map.put(c,map.getOrDefault(c, 0 ) + 1);
    }

    System.out.println(map);

  }
}

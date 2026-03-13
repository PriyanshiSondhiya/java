import java.util.*;

public class anagram {
  public static void main (String args[]){
    // String s1 = "listen";
    // String s2 = "silent";

    // char[] arr1 = s1.toCharArray();
    // char[] arr2 = s2.toCharArray();


    HashMap<Character, Integer> map = new HashMap<>();
    String s1 = "listen";
    String s2 = "silent";
    
    for(int i=0; i<s1.length(); i++){
      map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
    }

    for(int i=0; i<s2.length(); i++){
      char s =s2.charAt(i);
      if(map.get(s) != null){
        if(map.get(s) == 1){
          map.remove(s);
        }else{
          map.put(s, map.get(s)-1);
        }
      }else{
        System.out.println("false");
      }  
    }

    System.out.println( map.isEmpty());

    

  }
}

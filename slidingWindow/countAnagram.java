import java.util.*;

public class countAnagram {
  public static int count(String txt, String pat){
    HashMap<Character, Integer>map = new HashMap<>();

    for(char c : pat.toCharArray()){
      map.put(c, map.getOrDefault(c, 0)+1);
    }

    int k = pat.length();
    int i=0, j=0;
    int count = map.size();
    int ans = 0;

    while(j < txt.length()){
      char ch = txt.charAt(j);

      if(map.containsKey(ch)){
        map.put(ch, map.get(ch) -1 );

        if(map.get(ch) == 0) count--;
      }


      if(j-i+1 < k)j++;

      else if(j-i+1 == k){
        if(count == 0) ans++;

        char leftChar = txt.charAt(i);

        if(map.containsKey(leftChar)){
          map.put(leftChar, map.get(leftChar)+1);

          if(map.get(leftChar) == 1)
            count++;
        }
      }
      i++;j++;
    }

    return ans;

  }

  public static void main(String args[]){
    String txt = "forxxorfxfxdofr";
    String pat = "for";
    System.out.println(count(txt, pat));

  }
}

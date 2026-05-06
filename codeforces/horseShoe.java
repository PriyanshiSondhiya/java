import java.util.*;

public class horseShoe {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    HashSet<Integer>map = new HashSet<>();
      for(int i=0; i<4; i++){
        map.add(sc.nextInt());
      }
   
      System.out.println(4 - map.size());
  }
}

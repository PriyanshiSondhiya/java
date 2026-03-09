import java.util.*;


public class hashSetLoop {
  public static void main (String args[]){
  HashSet <String> cities = new HashSet<>();

  cities.add("delhi");
  cities.add("mumbai");
  cities.add("Noida");
  cities.add("Bengaluru");
 


  // Iterator it = cities.iterator();

  // while(it.hasNext()){
  //   System.out.println(it.next());
  // }

  for(String city : cities){
      System.out.println(city);
  }


  }
}

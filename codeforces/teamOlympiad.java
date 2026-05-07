import java.util.*;

public class teamOlympiad {
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);

  ArrayList<Integer> one = new ArrayList<>();
  ArrayList<Integer> two = new ArrayList<>();
  ArrayList<Integer> three = new ArrayList<>();

  int n = sc.nextInt();

  for(int i=1; i<=n; i++){
    int x = sc.nextInt();

    if(x == 1)one.add(i);
    else if (x == 2)two.add(i);
    else three.add(i);

  }

  int first = Math.min(one.size(), two.size() );
  int max = Math.min(first, three.size());

  System.out.println(max);

  for(int i=0; i<max; i++){
     System.out.println(one.get(i) + " " + two.get(i) + " " + three.get(i));
  }

  }
}

import java.util.*;

public class georgeAndSleep {
  public static void main (String args[]){
 Scanner sc = new Scanner(System.in);

 String s = sc.nextLine();//current time
 String t = sc.next();//sleep duration

 String a[] = s.split(":");
 String b[] = t.split(":");

int h1 = Integer.parseInt(a[0]);
int m1 = Integer.parseInt(a[1]);

int h2 = Integer.parseInt(b[0]);
int m2 = Integer.parseInt(b[1]);

//convert into min
int curr = h1*60 + m1;
int sleep = h2*60 + m2;

int res = curr - sleep;

if(res < 0){
  res += 1440;
}

//convert back
int hh = res/60;
int mm = res%60;

System.out.printf("%02d:%02d\n", hh, mm);




 
 

  }
}

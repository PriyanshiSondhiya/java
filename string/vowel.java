

public class vowel {
  public static void main (String args[]){
    String s = "priyanshi";

   int v =0;
   int con = 0;

   for(char c : s.toCharArray()){
      if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
        v++;
      }
      else{
        con++;
      }
   }

   System.out.println("con" +  con + "vowel" + v);
  }
}

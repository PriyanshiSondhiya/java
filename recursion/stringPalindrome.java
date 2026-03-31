public class stringPalindrome {
 public static boolean isPalindrome(String s, int i){
  int n = s.length();

  if(i > n/2)return true;
  if(s.charAt(i) != s.charAt(n-i-1))return false;
  
   return isPalindrome(s, i+1);
 } 

 public static void main(String[] args) {
    String s = "madAm";
    System.out.println(isPalindrome(s, 0));
  }

}

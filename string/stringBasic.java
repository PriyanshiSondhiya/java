public class stringBasic {
  public static void main (String args[]){
       String s = "Hello World";
       System.out.println(s);
        System.out.println(s.length());

        System.out.println(s.charAt(3));
        System.out.println(s.substring(0, 5));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("hello"));
        System.out.println(s.replace("H","y"));
        
        String s1 = "Java easy to learn";
        String[] words = s1.split(" ");
        for(String word: words){
          System.out.println(word + ",");
        }


        String s2 = "Hello";
        String reverse = "";
        s2.toCharArray();
        for(int i=s2.length()-1; i>=0; i--){
         reverse += s2.charAt(i);
        }

         System.out.println(reverse);

         if(s2.equals(reverse)){
          System.out.println("palindeome");
         }
        else{
          System.out.println("not palindrome");
        }
  }
}

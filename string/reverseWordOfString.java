public class reverseWordOfString {
  public static void main (String args[]){
    String str3 = "DSA job ke sath bhi job k baad bhi";
    

    String []words = str3.split(" ");
    for(String word: words ){
       String temp = "";
       for(int i = word.length()-1; i>=0; i--){
          temp += word.charAt(i);
       }

        System.out.println(temp);
    }

  }
}

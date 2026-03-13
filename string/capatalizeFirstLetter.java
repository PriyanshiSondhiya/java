public class capatalizeFirstLetter {
  public static void main (String args[]){
    String str = "dsa job ke sath bhi job ke baad bhi";
     String words[] = str.split(" ");
     String newString = " ";

     for(String word: words){
      for(int i=0; i<1; i++){
        word.toCharArray();
        newString += word.toUpperCase(word.charAt(i));
      }
     }



  }
}

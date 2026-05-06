import java.util.*;

public class duplicateBracket {
  public static void main (String args[]){
    Stack<Character> st = new Stack<>();
    String str = "(a+b) + ((c+d))";

    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      if(ch == ')'){
            if(st.peek() == '('){
              System.out.println("True");
              return;
            }else{
              while(st.peek() != '('){
                st.pop();
              }
              st.pop();
            }
      }
      else{
        st.push(ch);
      }
    }
    System.out.println("false");
  }
}

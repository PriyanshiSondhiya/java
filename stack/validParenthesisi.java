import java.util.*;

public class validParenthesisi {
  public static boolean set(Stack <Character> st, char c){
    if(st.size() == 0)return false;
    else if (st.peek() != c)return false;
    else {
      st.pop();
      return true;
    }
  }
  public static void main (String args[]){
  String str = "(a+b) - ((a+b))";
  Stack<Character> st = new Stack<>();
  
  for(int i=0; i<str.length(); i++){
     char ch = str.charAt(i);

     if(ch == '(' || ch == '{' || ch == '['){
            st.push(ch);
     }
     else if(ch == ')'){
      boolean val = set(st, '(');
      if(val == false){
        System.out.println(val);
        return;
      }
     }
     else if (ch == '}'){
      boolean val = set(st, '{');
      if(val == false){
        System.out.println(val);
        return;
     }
    }
     else if(ch == ']'){
      boolean val = set(st, '[');
      if(val == false){
        System.out.println(val);
        return;
     }
     
  }

}

  if(st.size() == 0){
    System.out.println(true);
  }
  else{
    System.out.println(false);
  }
  }
}

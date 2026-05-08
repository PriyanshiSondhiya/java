import java.util.*;

public class nextGreaterElementOnRight1 {
  public static void main (String args[]){
    Stack<Integer> st = new Stack<>();
    int arrA[] = new int[6];
    int arrQ[] = {2, 3, 1, 3, 4, 5};

    st.push(arrQ[arrQ.length-1]);
    arrA[arrA.length-1] = -1;
    for(int i = arrQ.length-2; i>=0; i--){
      while(arrQ[i] >= st.peek() && st.size() > 0){
            st.pop();
      }
     
      if(st.size() == 0){
        arrA[i] = -1;
      }else{
        arrA[i] = st.peek();
      }

      st.push(arrQ[i]);
    }
   
   for(int i=0; i<arrA.length; i++){
    System.out.println(arrA);
   }

  }
}

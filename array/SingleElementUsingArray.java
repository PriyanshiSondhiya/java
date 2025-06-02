package array;
public class SingleElementUsingArray {
    public static void main(String args[]){
        String str="hello";
        char ch[]=str.toCharArray();

        // for(int i=0; i<ch.length; i++){
        //     System.out.println(ch[i]);
        // }

        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    System.out.println(ch[i]);
                   return;
                }
                
               
            }
        }
    }
}

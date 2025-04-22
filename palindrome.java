public class palindrome {
    public static void main(String args[]){
        int a=121;
    int original=a;
    int rev=0;

    while(a>0){
        int lastDigit= a%10;
        rev=rev*10+lastDigit;
        a=a/10;
    }

    if(original == rev){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
    }
    
}

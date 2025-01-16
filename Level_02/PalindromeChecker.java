class Palindrome{
    String text;

    Palindrome(String text){
         this.text=text;
    }
    
    boolean isPalindrome(){
        String reverse = "";
        for(int i=text.length()-1; i>=0; i--){
            reverse += text.charAt(i);
        }
        if(text.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }

    void display(){
        boolean result=isPalindrome();
        if(result){
            System.out.println(text+" is a palindrome string");
        }else{
            System.out.println(text+" is not a palindrome string,.");
        }
    }

}
public class PalindromeChecker {
    public static void main(String[] args) {
        Palindrome palindrome=new Palindrome("zaraz");
        palindrome.display();
    }
}

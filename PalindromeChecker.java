public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String input = "evel";
        

        System.out.println("Is Palindrome? " + isPalindrome(input));  
    }
}

public class LongestUniqueSubstring {

    public static int longestUniqueSubstring(String str) {
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            String current = ""; 

            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);

                
                if (current.indexOf(c) != -1) {
                    break; 
                }

                current += c; 
            }

            
            if (current.length() > maxLength) {
                maxLength = current.length();
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcdef";
        int result = longestUniqueSubstring(input);
        System.out.println("Longest substring length: " + result); 
    }
}

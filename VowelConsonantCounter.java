public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase(); 

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static void main(String[] args) {
        String input = "im a discko dancer";
        countVowelsAndConsonants(input);  
    }
}

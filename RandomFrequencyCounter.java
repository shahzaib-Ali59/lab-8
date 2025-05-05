public class RandomFrequencyCounter {

    public static void main(String[] args) {
        int[] frequency = new int[21]; 

        for (int i = 0; i < 100; i++) {
            int num = (int)(Math.random() * 21); 
            frequency[num]++;
        }

        
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Number " + i + ": " + frequency[i] + " times");
        }
    }
}

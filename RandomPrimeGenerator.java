public class RandomPrimeGenerator {


    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int generateRandomPrime(int min, int max) {
        int count = 0;

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No prime numbers found in the given range.");
            return -1;
        }

        int randomIndex = (int)(Math.random() * count) + 1;

        int currentIndex = 0;
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                currentIndex++;
                if (currentIndex == randomIndex) {
                    return i;
                }
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int prime = generateRandomPrime(min, max);
        System.out.println("Random Prime: " + prime);
    }
}

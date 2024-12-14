package SieveofEratosthenesAlgo8;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 80; // Find prime nubs up to 50
        sieveOfEratosthenes(n);
    }

    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true; // Initialize all numbers as prime nubs
        }
        
        isPrime[0] = false;
        isPrime[1] = false; // 0 and 1 are not primes
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // Mark multiples as not prime nubs
                }
            }
        }
        
        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

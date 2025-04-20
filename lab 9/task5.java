import java.util.Scanner;
class task5{
public static int generateRandomPrime(int min, int max) {
    Random rand = new Random();
    List<Integer> primes = new ArrayList<>();
    for (int i = min; i <= max; i++) {
        if (isPrime(i)) {
            primes.add(i);
        }
    }
    if (primes.size() == 0) return -1;
    return primes.get(rand.nextInt(primes.size()));
}

public static boolean isPrime(int num) {
    if (num < 2) return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) return false;
    }
    return true;
}
}
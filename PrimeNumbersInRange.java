import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            boolean isPrime = true;

            // Numbers less than 2 are not prime
            if (i < 2) {
                isPrime = false;
            } else {

                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
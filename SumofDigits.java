import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int digit;
        while(N != 0) {
            digit = N % 10;
            sum = sum + digit;
            N = N / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}

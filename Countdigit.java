import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count=0;
        while (a>0) {
            int digit= a%10;
            a=a/10;
            count++;
        }
        System.out.print(count);
        sc.close();
    }
}

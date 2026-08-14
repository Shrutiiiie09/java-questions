import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");

        int i = sc.nextInt();
        int count = 0;

        while (i != 0) {
            i = i / 10;
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}
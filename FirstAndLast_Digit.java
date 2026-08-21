import java.util.Scanner;
 public class FirstAndLast_Digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int last= n % 10;

        while(n >= 10) {
            n = n / 10;
        }

        int first = n;
        System.out.println(first);
        System.out.println(last);
        sc.close();
    }
    
}

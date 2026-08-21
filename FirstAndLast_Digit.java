import java.util.Scanner;
 public class FirstAndLast_Digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number = ");
        int n = sc.nextInt();

        int i = 1;
        int last= n % 10;

        while(n >= 10) {
            n = n / 10;
        }

        int first = n;
        System.out.println("the first digit is = " +first);
        System.out.println("the last digit is = " +last);
        sc.close();
    }
    
}

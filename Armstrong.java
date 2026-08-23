import java.util.Scanner;

public class Armstrong{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int original = n;
            int sum = 0;
            int digit;

            while(n != 0){
                digit = n % 10;
                n = n / 10;
                sum = sum + digit*digit*digit;
            }
            if(original == sum) {
                System.out.println("the number is armstrong");
            }
            else{
                System.out.println("the number is not armstrong");
            }
            sc.close();
        }
    }
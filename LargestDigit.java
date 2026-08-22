import java.util.Scanner;
public class LargestDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number = ");
        int n = sc.nextInt();
        int largest = 0;
        int digit;

        while(n != 0) {

        digit= n % 10;

        if(digit>largest){
            largest = digit;
        } 
        n = n / 10;
        }

        System.out.println("the largest number is = " +largest);
        sc.close();
    }
    
}

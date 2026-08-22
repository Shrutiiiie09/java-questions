import java.util.Scanner;
public class SmallestDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int smallest = n;
        int digit;

        while(n != 0) {

        digit= n % 10;

        if(digit<smallest){
            smallest = digit;
        } 
        n = n / 10;
        }

        System.out.println("the largest number is = " +smallest);
        sc.close();
    }
    
}

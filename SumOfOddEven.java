import java.util.Scanner;
public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter n:");

        int n = sc.nextInt();
        int evenSum = 0;
        int OddSum = 0;

        for (int i = 1; i <= n; i++) {

            if(i % 2 == 0){
                evenSum = evenSum + i;
            }
            else{
                OddSum = OddSum + i;
            }
        }
        System.out.println("Sum of Even number is ="  +evenSum);
        System.out.println("Sum of Odd number is ="  +OddSum);

        sc.close();
    }
    
}

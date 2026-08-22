import java.util.Scanner;
public class Count_Occurrence_of_a_Digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number = ");
 int n = sc.nextInt();

        System.out.println("enter a digit = ");

       
        int Target_Digit= sc.nextInt();
        int count = 0;
        int Digit;


        while(n != 0){
            Digit = n % 10;
            if(Digit == Target_Digit) {
                count++ ;
            }
            n = n / 10;
        }
        System.out.println("the digit occurs times = " +count);
         sc.close();
    }
    
}

import java.util.Scanner;
public class Count_Occurrence_of_a_Digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
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
        System.out.println(count);
         sc.close();
    }
    
}

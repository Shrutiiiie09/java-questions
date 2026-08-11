import java.util.Scanner;
public class Op2 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);

        int a =Sc.nextInt();
        if(a == 0){
    System.out.println("number is zero");
    }
    else if(a > 0){
    System.out.println("Positive number");
    }
    else{
    System.out.println("Negative number");
    }
    Sc.close();

    }
}

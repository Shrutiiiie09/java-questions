import java.util.Scanner;
public class Op3 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);

        int a =Sc.nextInt();
        if(a % 2 == 0){
    System.out.println("Even");
    }
    else{
    System.out.println("odd");
    }
    Sc.close();

    }
}
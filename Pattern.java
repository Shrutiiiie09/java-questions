import java.util.Scanner;
    public class Pattern{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter row = ");
            int n = sc.nextInt();
            System.out.print("Enter columns = ");
            int m = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("x");
                }
                System.out.println();
            }
            sc.close();
        }
    }
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        } else{
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Greatest common factor: " + a);

        }
    }
}
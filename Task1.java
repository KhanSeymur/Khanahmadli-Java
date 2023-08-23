import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //If the entered number is greater than 7, then print “Hello”
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num > 7) {
            System.out.println("Hello");
        } else {
            System.exit(0);
        }


        scanner.close();
    }

}

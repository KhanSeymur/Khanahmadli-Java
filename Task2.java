import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //If the entered name matches “John”, then output “Hello, John”, if not, then output "There is no such name"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        if ("John".equals(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        scanner.close();
    }
}

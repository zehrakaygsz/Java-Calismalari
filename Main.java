import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old and your GPA is " + gpa);
        System.out.println("Student : " + isStudent);

        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("you aren't a student.");

        }

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
        area = width * height;
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}

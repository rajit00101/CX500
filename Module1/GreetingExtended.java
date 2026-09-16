import java.util.Scanner;

public class GreetingExtended {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("Hi, " + name + "! What is your major? ");
        Scanner major = new Scanner(System.in);
        String majorStr = major.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the program. Your major in " + majorStr + " will definitely be helpful!");
        scanner.close();
        major.close();
    }
}
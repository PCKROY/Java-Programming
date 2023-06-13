import java.util.Scanner;

public class UI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");

        String name = scanner.nextLine();
        System.out.printf("Hello %s.How are you today? Is everything go in your way today? ", name);

        String Question = scanner.nextLine();
        System.out.printf("Very good then.May I ask about your age pls? ");

        // for writing the codes or asking the question together, have to use " parse "

        int age = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d is a very good age to be productive in the industry works. What language do you prefer the most in coding? ", age);

        String language = scanner.nextLine();
        System.out.printf("%s is a very good language to code ", language);




        scanner.close();





    }
}

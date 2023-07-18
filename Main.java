// you can learn basic java with this code

import java.util.Scanner;
// if you want to import scanner than use "import java.util.Scanner"
public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("made by dwwe\n");

        System.out.println("what is your name");
        String name = scanner.nextLine();
        System.out.println("what is your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your favourite food");
        String food = scanner.nextLine();

        System.out.println(" your name is"+name);
        System.out.println("you age is "+age);
        System.out.println(" your favourite food is "+food);
        for (int i = 1; i <= 5; i++) {


        }
    }
}
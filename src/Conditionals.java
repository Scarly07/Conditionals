import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Boolean teacherTalks = true;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("Seems like you still have a bit of your childhood left...");


        } else{
                System.out.println("Congrats on your adulthood, and remember: Don't drink and drive!");
            }
        }
    }











import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int birthMonth;

        System.out.println("What is your birth month? (Using 1-12)");
        if (scan.hasNextInt()) {
            birthMonth = scan.nextInt();
            if (1 <= birthMonth && 12 >= birthMonth) {
                System.out.println("Your birth month is " + birthMonth);
            } else
                System.out.println("The number you entered is not between 1 and 12");
        }
        else
            System.out.println("The value you entered is incorrect");
    }
    }

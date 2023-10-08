import java.util.Scanner;

public class ControlFlow {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean canVote = false;
        int age = 24;
        if (age > 18 && canVote) {

            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }
        System.out.println("please choose a day");
        int day = scanner.nextInt();
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        switch (day) {
            case 1:
                System.out.println("sunday from switch");
                break;
            case 2:
                System.out.println("monday from switch");
                break;

            default:
                if (day < 7) {

                    System.out.println(days[day - 1]);
                }
                System.out.println("no such day");

                break;
        }

    }

}

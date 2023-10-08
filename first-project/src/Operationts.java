public class Operationts {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println("summation: " + (num1 + num2));
        System.out.println("subtraction: " + (num1 - num2));
        System.out.println("division: " + (num1 / num2));
        System.out.println("multiplication: " + (num1 * num2));
        System.out.println("remainder: " + (num1 % num2));

        int myNumber = 6;
        System.out.println(myNumber + " + 1 = " + (++myNumber));
        System.out.println(myNumber + " + 4 = " + (myNumber += 4));
        System.out.println(myNumber + " - 4 = " + (myNumber -= 4));
        System.out.println(myNumber + " * 4 = " + (myNumber *= 4));

    }
}

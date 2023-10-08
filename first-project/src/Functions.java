public class Functions {
    public static void main(String[] args) {

        sayHello("mahmoud", 24);
    }

    public static void sayHello(String name, int age) {

        System.out.println("hello " + name + "Your age is " + age);
        System.out.println(getMax(5, 2));
    }

    public static int getMax(int num1, int num2) {
        int max = num1;
        if (num2 > num1)
            max = num2;

        return max;
    }

}

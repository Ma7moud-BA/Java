public class Arrays {
    public static void main(String[] args) {
        int[] numbers = { 1, 24, 33, 578, 45, 66, 77 };
        // System.out.println("array length = " + numbers.length);

        // for (int i : numbers) {

        // System.out.println(i);
        // }

        // int[] numbers2 = new int[5];
        // numbers2[0] = 1;
        // for (int i : numbers2) {
        // System.out.println(i);
        // }

        int max = getMaxFromArray(numbers);
        System.out.println("max number in the arrays is: " + max);
    }

    public static int getMaxFromArray(int[] numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max)
                max = number;

        }

        return max;
    }
}

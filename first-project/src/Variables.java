import javax.sound.sampled.AudioFileFormat.Type;

public class Variables {
    public static void main(String[] args) {
        // ? string
        String name = "mahmoud";

        // ? int
        int age = 23;
        int maxIntegerValue = Integer.MAX_VALUE;
        int minIntegerValue = Integer.MIN_VALUE;
        System.out.println("Hello " + name + "my age is " + age);
        System.out.println("min integer value: " + minIntegerValue);
        System.out.println("max integer value: " + maxIntegerValue);

        // ? byte
        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("minByteValue: " + minByteValue);
        System.out.println("maxByteValue: " + maxByteValue);

        // ? long
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println("minLongValue: " + minLongValue);
        System.out.println("maxLongValue: " + maxLongValue);
        long myNumber = 222123123123123L; // you have to put the letter L to tell the compiler that this is meant to be
                                          // a long
        // ? short
        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        System.out.println("minShortValue: " + minShortValue);
        System.out.println("maxShortValue: " + maxShortValue);

        // ? float // float has a size of 32 bit
        float myFloatNumber = 3.14f; // you have to specify it with the letter f
        // ? double // double has a size of 64 bit has bigger precision
        System.out.println("myFloatNumber: " + myFloatNumber);

        double myDoubleNumber = 2.8;
        System.out.println("myDoubleNumber: " + myDoubleNumber);

        // ? char //use the single quotation
        char letter = 'g';
        System.out.println("letter: " + letter);

        // ? boolean
        boolean isActive = true;
        System.out.println(isActive);

    }
}

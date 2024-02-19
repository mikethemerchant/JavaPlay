public class JavaDataTypes {
    public static void main(String arg[]) {

        // primitive types - not an object; always have a value
        char intial = 'J';
        boolean passTest = false;
        byte b = -128;
        short s = 32767;
        int attempts = 2111333444;
        long l = 111222333;
        float f = 3434.123456f;
        double partofit = 1.12345678901234d;

        // non-primitive - object; can be null; start with uppercase
        String mikename = "Michael";

        System.out.println(b + s + l + f);

        attempts = attempts + 1; 

        if (passTest) {
            System.out.println(mikename + " " + intial + ":" + attempts * partofit);
        }
        else {
            System.out.println(passTest);
        }

    }
}
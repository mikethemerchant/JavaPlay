public class Operators {
    public static void main(String arg[]) {
        String werd = "werd";
        String blah = "blah";

        int i = 0;

        float f = 0.5f;

        double d = 54321.12345;

        int seven = 7;
        int three = 3;

        int x = 1;

        // System.out.println(werd + blah);

        // System.out.println(i++ * f);

        // System.out.println(i - f);

        // System.out.println(d / f);

        // System.out.println(seven % three);

        // System.out.println(x += 4);

        int y = 3;

        i = 1;
        System.out.println(i);
        System.out.println(y);
        System.out.println(x);

        if(i == x) {
            System.out.println("YES");
        }

        if(i != y) {
            System.out.println("NICE");
        }

        if(y >= i) {
            System.out.println("BETTER");
        }

        if(x == i && y > i) {
            System.out.println("AND");
        }

        if(x == i || y > 5) {
            System.out.println("OR");
        }

        if(!(y > 3)) {
            System.out.println("NOT");
        }
    }
}
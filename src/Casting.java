public class Casting {
    public static void main(String arg[]) {


        int widen1 = 5;
        double widen2 = 10.5 + widen1;

        double narrow1 = 33.22;
        int narrow2 = 1 + (int)narrow1;

        System.out.println(widen2);
        System.out.println(narrow2);
    }
}
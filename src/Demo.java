public class Demo {
    public static void main(String arg[]) {

        // types
        String mikename = "Michael";
        int attempts = 10;
        double partofit = 1.5;
        char intial = 'J';
        boolean passTest = true;

        attempts = attempts + 1; 

        if (passTest) {
            System.out.println(mikename + " " + intial + ":" + attempts * partofit);
        }
        else {
            System.out.println("fail...");
        }

    }
}
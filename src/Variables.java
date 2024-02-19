public class Variables {
    public static void main(String arg[]) {

        // types
        String mikename = "Michael";
        int attempts = 10;
        double partofit = 1.5;
        float actualFloat = 2.2f;
        char intial = 'J';
        boolean passTest = false;
        // this is intresting assign many var the same value.
        int x, y, z;
        x = y = z = 25;

        attempts = attempts + 1;
        
        

        if (passTest) {
            System.out.println(mikename + " " + intial + ":" + attempts * partofit * actualFloat);
        }
        else {
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }

    }
}
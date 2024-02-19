public class Looping {
    public static void main(String[] args) {

        int i = 1;

        while( i <= 5) {
            System.out.println("test" + i);
            i++;
        }

        i = 1;
        do {
            System.out.println("do:" + i);
            i++;
        } while ( i <= 5 );

        for (int x = 1; x <= 5; x++) {
            System.out.println("for:" + x);
            if (x == 3) {
                break;
            }
        }

        //for each

        String[] colors = {"blue","black","red", "pink"};
        
        for (String c : colors) {
            System.out.println(c);
        }

        for (int x = 1; x <= 5; x++) {
            System.out.println("for:" + x);
            if (x == 3) {
                break;
            }
        }

    }
}

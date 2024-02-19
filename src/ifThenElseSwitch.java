public class ifThenElseSwitch {
    public static void main(String arg[]) {
        int i = 2;
        int x = 1;
        int j = 3;
        
        if(i < x) {
            System.out.println("TRUE");
        } else if (i == x) {
            System.out.println("EQUAL");
        } else {
            System.out.println("FALSE");
        }

        String r = (i > x) ? "YES" : "NO";
        System.out.println(r);

        switch(j) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
        }
        
    }
}
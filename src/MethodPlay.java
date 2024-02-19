public class MethodPlay {
    
    static void PrintMe (String s) {
        System.out.println(s);
    }

    static int Mutiply (int x, int y) {
        return x * y;
    }

    
    static double Mutiply (double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {

        String result = String.valueOf(Mutiply(2,3));
        PrintMe(result);

        String resultD = String.valueOf(Mutiply(4.5,2.5));
        PrintMe(resultD);

    }
}

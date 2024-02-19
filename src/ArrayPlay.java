public class ArrayPlay {
    public static void main(String[] args) {
        String[] colors = {"blue","black","red", "pink"};

        for (int x = 1; x <= 4; x++) {
            System.out.println(colors[x-1]);
        }

        int[][] multi = { {1, 2, 3, 4}, {5, 6, 7, 8 } };

        for (int x = 0; x < multi.length; x++ ) {
            for (int j = 0; j < multi[x].length; j++ ) {
                System.out.println(multi[x][j]);
            }
        }
    }
    
}

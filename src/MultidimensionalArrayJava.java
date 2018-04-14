public class MultidimensionalArrayJava {
    public static void main(String[] args) {
        int[][] multidimensionalArrayJava = new int[2][2];

        multidimensionalArrayJava[0][0] = 1;
        multidimensionalArrayJava[1][0] = 2;
        multidimensionalArrayJava[0][1] = 3;
        multidimensionalArrayJava[1][1] = 4;

//        print hardcode
        System.out.println(multidimensionalArrayJava[1][1]);

//        print using for
        for (int i = 0; i < multidimensionalArrayJava.length; i++) {
            for (int j = 0; j < multidimensionalArrayJava[i].length; j++)
                System.out.println(multidimensionalArrayJava[i][j]);
        }

//        print using for each
        for (int[] ref : multidimensionalArrayJava) {
            for (int numbers : ref) {
                System.out.println(numbers);
            }

        }

    }
}


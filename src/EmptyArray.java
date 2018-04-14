public class EmptyArray {
    public static void main(String[] args) {
        int[] emptyArrayInts = new int[3];

//        is the same resulto for byte, short long,float, doable;
        System.out.println(emptyArrayInts[0]);
        System.out.println(emptyArrayInts[1]);
        System.out.println(emptyArrayInts[2]);

        String[] emptyArrayString = new String[3];

        System.out.println(emptyArrayString[0]);
        System.out.println(emptyArrayString[1]);
        System.out.println(emptyArrayString[2]);

        char[] emptyArrayChar = new char[3];

        System.out.println(emptyArrayChar[0]);
        System.out.println(emptyArrayChar[1]);
        System.out.println(emptyArrayChar[2]);

        boolean[] emptyArrayBoolean = new boolean[3];

        System.out.println(emptyArrayBoolean[0]);
        System.out.println(emptyArrayBoolean[1]);
        System.out.println(emptyArrayBoolean[2]);
    }
}


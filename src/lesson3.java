import java.util.Random;

public class lesson3 {
    public static void main (String [] args) {
        changing01();
        two();
        numbers2();
        cross();
    }
    public static void changing01() {
        int[] array = new int[] {1, 0, 0, 1, 1, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }else {
                array[i] = 1;
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void two () {

        int [] arr = new int [100];
        for (int i = 1; i < 100; i++) {
            arr[i] = i;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void numbers2 () {
        int[] number = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 6) {
                number[i] = number[i] * 2;
                System.out.print(number[i] + " ");
            }

        }

    }
    public static void cross () {
        int [][] crossX = new int [10][10];
        Random random = new Random();
        for (int i = 0; i < crossX.length; i++) {
            for (int j = 0; j < crossX[i].length; j++) {
                if (i == j){
                    crossX [i][j] = 1;
                }
                if (j == crossX[i].length - 1 - i) {
                    crossX [i][j] = 1;
                }
            }
        }
        for (int i = 0; i < crossX.length; i++) {
            for (int j = 0; j < crossX[i].length; j++) {
                System.out.print(crossX [i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] five (int len, int initialValue) {
        int[] name = new int[len];
        for (int i = 0; i < name.length; i++){
            name[i] = initialValue;
            System.out.println(name[i]);
        }
        return name;
    }
}

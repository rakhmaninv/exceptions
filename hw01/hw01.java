import java.util.Arrays;

public class hw01 {
    public static void main(String[] args) {
        int[] first = new int[] { 5, 6, 4, 2, 8 };
        int[] second = new int[] { 2, 1, 0, 1, 6 };
        // System.out.println(Arrays.toString(arrayDifference(first, second)));
        System.out.println(Arrays.toString(arrayDivision(first, second)));
    }
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных
    // массива, и возвращающий новый массив, каждый элемент которого равен разности
    // элементов двух входящих массивов в той же ячейке. Если длины массивов не
    // равны, необходимо как-то оповестить пользователя.

    public static int[] arrayDifference(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        if (aLen != bLen) {
            throw new RuntimeException("Разная длина массивов");
        }
        int[] result = new int[aLen];
        for (int i = 0; i < aLen; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных
    // массива, и возвращающий новый массив, каждый элемент которого равен частному
    // элементов двух входящих массивов в той же ячейке. Если длины массивов не
    // равны, необходимо как-то оповестить пользователя. Важно: При выполнении
    // метода единственное исключение, которое пользователь может увидеть -
    // RuntimeException, т.е. ваше.

    public static double[] arrayDivision(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        if (aLen != bLen) {
            throw new RuntimeException("Разная длина массивов");
        }
        if (haveZero(b)) {
            throw new RuntimeException("Делить на ноль нельзя");
        }
        double[] result = new double[aLen];
        for (int i = 0; i < aLen; i++) {
            result[i] = a[i] / b[i];
        }
        return result;
    }

    private static boolean haveZero(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

}

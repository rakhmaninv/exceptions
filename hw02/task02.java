package hw02;

public class task02 {
    public static void main(String[] args) {

        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Индекс за пределами массива");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Что-то пошло не так...");
        }
    }
}

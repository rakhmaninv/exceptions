package hw02;

public class task03 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b); 
    }
}

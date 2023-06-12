package hw02;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {

        System.out.println(userFloatInput());
    }

    public static float userFloatInput() {

        float result;
        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Введите дробное число: ");
                result = input.nextFloat();
                input.close();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка ввода, ведите дробное число.");
            }
        }
        return result;
    }
}

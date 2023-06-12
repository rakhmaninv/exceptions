package hw02;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        System.out.println(userInput());
    }

    private static String userInput() {
        String input;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите что-то:");
        input = sc.nextLine();
        sc.close();

        if(input.isEmpty()) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        }
        return input;
    }
}

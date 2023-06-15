package hw03;


import java.time.format.DateTimeParseException;
import java.util.Scanner;

import hw03.exceptions.FewArgumentsException;
import hw03.exceptions.ManyArgumentsException;
import hw03.exceptions.SaveException;
import hw03.exceptions.WrongSexFormatException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "cp1251");
        boolean run = true;
        String input = "";

        while (run) {
            // Иванов Иван Иванович 12.12.2000 123 m
            try {
                System.out.println(
                        "Введите фамилию, имя, отчество, год рождения(в формате dd.mm.yyyy), телефон(без знаков) и пол(f или m) через пробел");
                input = scan.nextLine();
                System.out.println(input);
                
                ContactServis cs = new ContactServis(input);
                Contact contact = new Contact(cs.inputValidation());
                SaveService saveService = new SaveService(contact.getLastName());
                System.out.println(contact);
                
                saveService.save(contact);
                System.out.println("сохранение прошло успешно");
                scan.close();
                run = false;
            } catch (DateTimeParseException | NumberFormatException | FewArgumentsException | ManyArgumentsException
                    | WrongSexFormatException e) {
                System.out.println(e.getMessage());
            } catch (SaveException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        }

    }
}

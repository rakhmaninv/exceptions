package hw03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private Integer phoneNumber;
    private Character sex;

    public Contact(String lastName, String firstName, String middleName, LocalDate birthDate, Integer phoneNumber,
            Character sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public Contact(String[] input) {
        this(input[0], 
            input[1], 
            input[2], 
            LocalDate.parse(input[3], DateTimeFormatter.ofPattern("dd.MM.uuuu")), 
            Integer.parseInt(input[4]), 
            input[5].charAt(0));
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<" + lastName + ">");
        sb.append("<" + firstName + ">");
        sb.append("<" + middleName + ">");
        sb.append("<" + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.uuuu")) + ">");
        sb.append("<" + phoneNumber + ">");
        sb.append("<" + sex + ">");
        return sb.toString();
    }

}

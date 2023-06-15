package hw03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import hw03.exceptions.FewArgumentsException;
import hw03.exceptions.ManyArgumentsException;
import hw03.exceptions.WrongSexFormatException;

public class ContactServis {
    private String userInput;
    private DateTimeFormatter dateFormat;

    public ContactServis(String userInput, String dateFormat) throws IllegalArgumentException {
        this.userInput = userInput;
        if (dateFormat == null) {
            this.dateFormat = DateTimeFormatter.ofPattern("dd.MM.uuuu");
        } else {
            this.dateFormat = DateTimeFormatter.ofPattern(dateFormat);
        }
    }

    public ContactServis(String input) {
        this(input, null);
    }

    public String[] inputValidation() throws DateTimeParseException, NumberFormatException, FewArgumentsException,
            ManyArgumentsException, WrongSexFormatException {
        // <Фамилия><Имя><Отчество><датарождения><номертелефона><пол>
        String[] inputArr = userInput.split(" ");
        if (inputArr.length < 6) {
            throw new FewArgumentsException("введено слишком мало данных");
        }
        if (inputArr.length > 6) {
            throw new ManyArgumentsException("введено слишком много данных");
        }
        LocalDate parsedDate = LocalDate.parse(inputArr[3], dateFormat);
        int phone = Integer.parseInt(inputArr[4]);
        if (!inputArr[5].equalsIgnoreCase("f")
                & !inputArr[5].equalsIgnoreCase("m")) {
            throw new WrongSexFormatException("введен не правильный формат пола. должно быть f или m");
        }

        return inputArr;
    }
}

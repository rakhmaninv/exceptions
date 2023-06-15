package hw03.exceptions;

import java.io.IOException;

public class SaveException extends IOException {
    public SaveException(String msg) {
        super(msg);
    }
    
}

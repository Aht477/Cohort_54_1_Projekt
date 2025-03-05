package homework_43;

public class PasswordValidateException extends RuntimeException{

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exeprion  " + super.getMessage();
    }
}

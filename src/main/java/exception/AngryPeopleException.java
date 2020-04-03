package exception;

public class AngryPeopleException extends Exception {
    @Override
    public String getMessage(){
        return "People are not happy with high prices. Strikes are possible.";
    }
}
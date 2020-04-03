package exception;

public class LowIncomeException extends AngryPeopleException {
    @Override
    public String getMessage(){
        return "It is not possible to pay taxes because of low salaries";
    }
}

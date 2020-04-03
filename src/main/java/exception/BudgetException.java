package exception;

public class BudgetException extends Exception {
    @Override
    public String getMessage(){
        return "Country has not enough money";
    }
}

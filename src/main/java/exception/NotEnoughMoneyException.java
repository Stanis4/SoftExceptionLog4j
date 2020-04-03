package exception;

public class NotEnoughMoneyException extends LowIncomeException {
    @Override
    public String getMessage(){
        return "It is not possible to pay taxes, as there is no money";
    }
}

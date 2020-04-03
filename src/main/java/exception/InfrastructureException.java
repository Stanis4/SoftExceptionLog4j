package exception;

public class InfrastructureException extends BudgetException {
    @Override
    public String getMessage(){
        return "It is not possible to improve the city, as there is no money";
    }
}

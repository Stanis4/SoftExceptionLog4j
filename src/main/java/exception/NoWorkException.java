package exception;

public class NoWorkException extends InfrastructureException {
    @Override
    public String getMessage(){
        return "It is not possible to get work, as there are no workplaces";
    }
}

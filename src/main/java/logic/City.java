package logic;
import exception.InfrastructureException;
import exception.LowIncomeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class City extends Country{
    private boolean enoughJobs = false;
    private boolean enoughBudget = true;
    private static final Logger logger = LogManager.getLogger(City.class);

    @Override
    public void improveInfrastructure() throws InfrastructureException, LowIncomeException {
        logger.warn("Infrastructure can be improved id there are enough workers");
        if (enoughJobs){
            throw  new InfrastructureException();
        }
        if (enoughBudget){
            throw new LowIncomeException();
        }
    }
    @Override
    public void makeTaxesHigher()  {
        logger.info("City tries to make Taxes higher!");
        try{
            createWorkPlaces();
            improveInfrastructure();
        }catch (InfrastructureException | LowIncomeException e){
            logger.warn(e);
        }
    }
    public void createWorkPlaces(){
    }
}

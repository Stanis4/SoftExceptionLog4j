package logic;
import exception.AngryPeopleException;
import exception.BudgetException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Country {
    private boolean highTaxes = true;
    private boolean highPrices = true;
    private static final Logger logger = LogManager.getLogger(Country.class);

    public void improveInfrastructure() throws BudgetException, AngryPeopleException {
        logger.warn("Infrastructure can be improved if the budget is good enough");
        if (highTaxes){
            throw new BudgetException();
        }
        if (highPrices){
            throw new AngryPeopleException();
        }
    }

    public void makeTaxesHigher() {
        try{
            logger.info("Country tries to make Taxes higher!");
            increaseExport();
            improveInfrastructure();
        }
        catch (BudgetException | AngryPeopleException e){
            logger.warn(e);
        }
    }

    public void increaseExport(){
    }

}

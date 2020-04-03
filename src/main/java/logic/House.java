package logic;

import exception.NoWorkException;
import exception.NotEnoughMoneyException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class House extends City {
    private boolean hasCar = true;
    private boolean hasJob = false;
    private static final Logger logger = LogManager.getLogger(House.class);

    @Override
    public void improveInfrastructure() throws NotEnoughMoneyException, NoWorkException {
        logger.warn("Infrastructure can be improved if the work is well-paid");
        if (hasCar){
            throw new NotEnoughMoneyException();
        }
        if(hasJob){
            throw new NoWorkException();
        }
    }

    @Override
    public void makeTaxesHigher()  {
        logger.info("Families try to pay higher taxes!");
        try {
            improveInfrastructure();
        } catch (NotEnoughMoneyException | NoWorkException e){
            logger.warn(e);
        }

    }
}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTroll implements Troll {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTroll.class);
    @Override
    public void attack() {
        LOGGER.info("the troll tries to crab you");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        LOGGER.info("the troll ran away!");
    }
}

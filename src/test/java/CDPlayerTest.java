import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest{

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "R2D2", 4);
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("R2D2", cdPlayer.getModel());
    }

    @Test
    public void canGetNumOfCDsCanHold() {
        assertEquals(4, cdPlayer.getNumOfCDsCanHold());
    }
}
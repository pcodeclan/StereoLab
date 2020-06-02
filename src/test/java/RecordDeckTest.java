import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Yamaha", "12345");
    }

    @Test
    public void hasMake(){
        assertEquals("Yamaha", recordDeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("12345", recordDeck.getModel());
    }

    @Test
    public void canSetPlaySpeed(){
        recordDeck.setPlaySpeed(10);
        assertEquals(10, recordDeck.getPlaySpeed());
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before(){
        Radio radio = new Radio("Panasonic", "RB4");
        RecordDeck recordDeck = new RecordDeck("Yamaha", "12345");
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Clyde1", stereo.getRadio().tune("Clyde1"));
    }

    @Test
    public void cansetPlaySpeed(){
        assertEquals(10, stereo.getRecordDeck().setPlaySpeed(10));
    }

}

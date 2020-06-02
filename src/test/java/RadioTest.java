import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Panasonic", "RB4");
    }

    @Test
    public void canGetMake(){
        assertEquals("Panasonic", radio.make);
    }

    @Test
    public void canGetModel(){
        assertEquals("RB4", radio.model);
    }

    @Test
    public void canTune(){
        assertEquals("Clyde1", radio.tune("Clyde1"));
    }



}

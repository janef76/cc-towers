import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    private Guest guest;

    @Before
    public void before() {
        guest = new Guest("Guest1");
    }

    @Test
    public void guestHasName() {
        assertEquals("Guest1", guest.getName());
    }

}

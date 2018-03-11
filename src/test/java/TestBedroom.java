import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before() {
        guest = new Guest("Guest1");
        this.bedroom = new Bedroom(2,null, 3, BedroomType.DOUBLE, 50);
    }

    @Test
    public void checkCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canAddGuestsToRoom() {
        bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.getGuestCount());
    }

   @Test
    public void canGetRoomNumber() {
        assertEquals(3, bedroom.getRoomNumber());
   }

   @Test
    public void canGetRoomType() {
        assertEquals(BedroomType.DOUBLE, bedroom.getRoomType());
   }

   @Test
    public void canGetRoomCapacity() {
        assertEquals(2, bedroom.getRoomCapacity());
   }

   @Test
    public void canChargeRoomRate() {
        assertEquals(50, bedroom.getRoomRate());
   }
}

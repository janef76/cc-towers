import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    private Hotel hotel;
    private Guest guest;

    @Before
    public void before() {
        guest = new Guest("Guest1");
        hotel = new Hotel(null, null);
    }

//    @Test
//    public void canGetGuest() {
//
//        assertEquals(1, hotel.getRoomCount());
//    }

    @Test
    public void canAddGuestToRoom() {
        hotel.addGuestInRoom(guest);
        assertEquals(1, hotel.getRoomCount());
    }

    @Test
    public void canGetGuestsName() {
        assertEquals("Guest1", hotel.getRoomInfo());
    }
}

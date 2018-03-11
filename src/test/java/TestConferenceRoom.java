import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestConferenceRoom {

    private ConferenceRoom conferenceRoom;
    private Guest guest;


    @Before
    public void before() {
        this.conferenceRoom = new ConferenceRoom(10, null, "Sea View", 30);
    }

    @Test
    public void checkCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuestsToRoom() {
        conferenceRoom.addGuestToRoom(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void canGetRoomName() {
        assertEquals("Sea View", conferenceRoom.getName());
    }

    @Test
    public void canChargeRoomRate() {
        assertEquals(30, conferenceRoom.getRoomRate());
    }
}

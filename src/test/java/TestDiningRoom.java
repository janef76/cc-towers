import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class TestDiningRoom {

        private DiningRoom diningRoom;
        private Guest guest;


        @Before
        public void before() {
            this.diningRoom = new DiningRoom(20, null, "Terrace");
        }

        @Test
        public void checkCapacity() {
            assertEquals(20, diningRoom.getCapacity());
        }

        @Test
        public void canAddGuestsToRoom() {
            diningRoom.addGuestToRoom(guest);
            assertEquals(1, diningRoom.getGuestCount());
        }

        @Test
        public void canGetRoomName() {
            assertEquals("Terrace", diningRoom.getName());
        }
    }


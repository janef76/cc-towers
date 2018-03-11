import com.sun.javafx.iio.common.PushbroomScaler;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Guest> guests;

    public Hotel(ArrayList<Room> rooms, ArrayList<Guest> guests) {
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
    }

    public int getRoomCount() {
        return rooms.size();
    }

    public void addGuestInRoom(Guest guest) {
        this.rooms.add(guest);
    }

    public String getRoomInfo() {
        String roomInfo = "";
        for ( int i = 0; i < getRoomCount(); i++) {
            roomInfo = roomInfo + guests.get(i).getName();
        }
        return roomInfo;
    }
}

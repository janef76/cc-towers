import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;
    private int roomRate;

    public ConferenceRoom(int capacity, ArrayList<Guest> guests, String name, int roomRate) {
        super(capacity, guests);
        this.name = name;
        this.roomRate = roomRate;
    }

    public String getName() {
        return this.name;
    }

    public int getRoomRate() {
        return this.roomRate;
    }
}

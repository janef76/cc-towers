import java.util.ArrayList;
import java.util.Calendar;

public class DiningRoom extends Room{

    private String name;

    public DiningRoom(int capacity, ArrayList<Guest> guests, String name) {
        super(capacity, guests);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

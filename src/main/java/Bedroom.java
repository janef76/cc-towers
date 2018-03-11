import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private BedroomType roomType;
    private ArrayList<Guest> guests;
    private int roomRate;

    public Bedroom(int capacity, ArrayList<Guest>guests, int roomNumber, BedroomType roomType, int roomRate) {
        super(capacity, guests);
//        this.guests = new ArrayList<>();
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomRate = roomRate;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public BedroomType getRoomType() {
        return this.roomType;
    }

    public int getRoomCapacity() {
        return this.roomType.getRoomCapacity();
    }

    public int getRoomRate() {
        return this.roomRate;
    }
}

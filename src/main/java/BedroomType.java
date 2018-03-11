public enum BedroomType {
    SINGLE(1),
    DOUBLE(2);

    private int roomCapacity;

    BedroomType(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public int getRoomCapacity() {
        return this.roomCapacity;
    }
}

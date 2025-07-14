package HMS.medicalServices;

public class Room {
    int roomNumber;
    String roomType;
    boolean isRoomAvailable;
    double dailyRate;

    public Room(int roomNumber, String roomType, double dailyRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isRoomAvailable = true;
        this.dailyRate = dailyRate;
    }

    public void assignRoom() {
        this.isRoomAvailable = false;
    }

    public void vacateRoom() {
        this.isRoomAvailable = true;
    }

    public boolean isRoomAvailable() {
        return false;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void displayRoom() {
        System.out.println("Room: " + roomNumber + " (" + roomType + ")");
        String isRoomAvb = isRoomAvailable ? "Yes" : "No";
        System.out.println("Available: " + isRoomAvb);
        System.out.println("Rate: " + dailyRate + "/day");
    }

}

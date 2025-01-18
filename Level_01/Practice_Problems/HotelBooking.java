public class HotelBooking {
    public String guestName; 
    public String roomType;
    public int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        defaultBooking.displayBookingDetails();

        System.out.println();

        HotelBooking paramBooking = new HotelBooking("John Doe", "Deluxe", 3);
        paramBooking.displayBookingDetails();

        System.out.println();

        HotelBooking copyBooking = new HotelBooking(paramBooking);
        copyBooking.displayBookingDetails();
    }
}

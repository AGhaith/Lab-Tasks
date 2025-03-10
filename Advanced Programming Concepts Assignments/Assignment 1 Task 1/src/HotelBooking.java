public class HotelBooking extends Booking {
    private String Hotel_Name;
    private String Room_Type;

    HotelBooking(String Customer_Name, String BookingDate, String Hotel_Name, String Room_Type) {
        super(Customer_Name, BookingDate);
        this.Hotel_Name = Hotel_Name;
        this.Room_Type = Room_Type;
    }

    void DisplayBookingDetails() {
        System.out.println("----Your Hotel Booking Details----");
        super.DisplayBookingDetails();
        System.out.println("Hotel Name = " + Hotel_Name);
        System.out.println("Room Type = " + Room_Type);
        System.out.println("----------------------------------");

    }

}

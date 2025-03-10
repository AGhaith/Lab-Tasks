
public class Booking {
    static int Booking_Counters = 1;
    final int BookingID = Booking_Counters++;
    String Customer_Name;
    String BookingDate;

    public int Get_BookingID() {
        return BookingID;
    }

    public String Get_Customer_Name() {
        return Customer_Name;
    }

    Booking(String Customer_Name, String BookingDate) {
        this.Customer_Name = Customer_Name;
        this.BookingDate = BookingDate;
    }

    void DisplayBookingDetails() {
        System.out.println("Booking ID = " + BookingID);
        System.out.println("Customer Name = " + Customer_Name);
        System.out.println("Booking Date = " + BookingDate);
    }

}

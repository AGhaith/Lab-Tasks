public class FlightBooking extends Booking {
    private String Flight_Number;
    private String Seat_Class;

    FlightBooking(String Customer_Name, String BookingDate, String Flight_Number, String Seat_Class) {
        super(Customer_Name, BookingDate);
        this.Flight_Number = Flight_Number;
        this.Seat_Class = Seat_Class;
    }

    void DisplayBookingDetails() {
        System.out.println("----Your Flight Booking Details----");
        super.DisplayBookingDetails();
        System.out.println("Flight Number = " + Flight_Number);
        System.out.println("Seat Class = " + Seat_Class);
        System.out.println("----------------------------------");

    }

}

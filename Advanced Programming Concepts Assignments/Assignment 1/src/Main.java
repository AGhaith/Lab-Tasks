public class Main {
    public static void main(String[] args) {
        String Name = "Ahmed Ghaith";
        String Date = "3/10/2025";
        String Flight_Number = "A25-09";
        String HotelName = "Ritz Paris";
        String SeatClass = "First Class";
        String RoomType = "Imperial Suite";
        FlightBooking FB1 = new FlightBooking(Name, Date, Flight_Number, SeatClass);
        HotelBooking HB1 = new HotelBooking(Name, Date, HotelName, RoomType);
        FB1.DisplayBookingDetails();
        HB1.DisplayBookingDetails();
    }
}

public class PickupOrder extends Order{
    String PickupTime;
    PickupOrder(int OrderID, String CustomerName, String RestaurantName, String PickupTime){
        super(OrderID,CustomerName,RestaurantName);
        this.PickupTime = PickupTime;
    }
    public void DisplayOrderDetails(){
        super.DisplayOrderDetails();
        System.out.println("Pickup Time: " + PickupTime);
        System.out.println("--------");

    }

}

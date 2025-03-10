public class DeliveryOrder extends Order{
    private String DeliveryAddress;
    private Double DeliveryFee;
    DeliveryOrder(int OrderID, String CustomerName, String RestaurantName, String DeliveryAddress, Double DeliveryFee){
        super(OrderID,CustomerName,RestaurantName);
        this.DeliveryAddress = DeliveryAddress;
        this.DeliveryFee = DeliveryFee;
    }
    public void DisplayOrderDetails(){
        super.DisplayOrderDetails();
        System.out.println("Delivery Address: " + DeliveryAddress);
        System.out.println("Delivery Fee: " + DeliveryFee);
        System.out.println("--------");
    }

}

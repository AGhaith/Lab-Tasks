public class Order {
    private int OrderID;
    private String CustomerName;
    private String RestaurantName;
    Order(int OrderID, String CustomerName, String RestaurantName){
        this.OrderID = OrderID;
        this.CustomerName = CustomerName;
        this.RestaurantName = RestaurantName;
    }
    public void DisplayOrderDetails(){
        System.out.println("---------");
        System.out.println("Order ID: " + OrderID);
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Restaurant Name: " + RestaurantName);
    }
}

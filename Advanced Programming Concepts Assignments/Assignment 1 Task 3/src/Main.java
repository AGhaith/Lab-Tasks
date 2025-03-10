// Task 3 Ahmed Ghaith 231001000
public class Main {
    public static void main(String[] args) {
        DeliveryOrder DO = new DeliveryOrder(1,"Ahmed Ghaith","Le Meurice Alain Ducasse","Shiekh Zayed",10000.0);
        DO.DisplayOrderDetails();
        PickupOrder PO = new PickupOrder(2,"Ahmed Ghaith","Le Meurice Alain Ducasse","12:00AM");
        PO.DisplayOrderDetails();
    }
}
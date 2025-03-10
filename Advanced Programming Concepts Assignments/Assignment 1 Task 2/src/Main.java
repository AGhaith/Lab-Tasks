// Task 2 Ahmed Ghaith 231001000
public class Main {
    public static void main(String[] args) {
        CurrencyConverter CC1 = new CurrencyConverter();
        CC1.Set_Currency_Type("EGP","USD");
        CC1.Convert_Amount(100000);
        System.out.println(CC1);
        CC1.Set_Currency_Type("USD","EUR");
        CC1.Convert_Amount(1000);
        System.out.println(CC1);
        CC1.Set_Currency_Type("EUR","EGP");
        CC1.Convert_Amount(1000);
        CC1.Convert_Amount(5000);
        System.out.println(CC1);
    }
}
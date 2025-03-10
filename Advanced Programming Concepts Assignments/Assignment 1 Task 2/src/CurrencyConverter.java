public class CurrencyConverter {
    private double Amount;
    private double New_Amount;
    private String Currency_Type_From;
    private String Currency_Type_To;
    private double Conversion_Rate;
    public void Set_Currency_Type(String Currency_Type_From, String Currency_Type_To) {
        this.Currency_Type_To = Currency_Type_To;
        this.Currency_Type_From = Currency_Type_From;
        Set_Conversion_Rate(Currency_Type_From,Currency_Type_To);
    }
    private void Set_Conversion_Rate(String Currency_Type_From,String Currency_Type_To) {
        switch (Currency_Type_From) {
            case "USD" -> {
                if (Currency_Type_To.equals("EUR")) {
                    Conversion_Rate = 0.85;
                } else if (Currency_Type_To.equals("EGP")) {
                    Conversion_Rate = 50;
                }
            }
            case "EUR" -> {
                if (Currency_Type_To.equals("USD")) {
                    Conversion_Rate = 1.15;
                } else if (Currency_Type_To.equals("EGP")) {
                    Conversion_Rate = 55;
                }
            }
            case "EGP" -> {
                if (Currency_Type_To.equals("USD")) {
                    Conversion_Rate = 0.05;
                } else if (Currency_Type_To.equals("EUR")) {
                    Conversion_Rate = 0.055;
                }
            }
        }
    }
    public void Convert_Amount(double Amount) {
        this.Amount = Amount;
        this.New_Amount = Amount * Conversion_Rate;
    }
    public String toString(){
        System.out.println("---- Converting "+ Amount + Currency_Type_From + " To " + Currency_Type_To + " ----");
        System.out.println( "Conversion Rate = " + Conversion_Rate);
        System.out.println( "Amount = " + Amount);
        System.out.println( "After Conversion -> " + New_Amount + Currency_Type_To);
        this.Amount = New_Amount;
        String Temp = Currency_Type_To;
        Currency_Type_To = Currency_Type_From;
        Currency_Type_From = Temp;
        System.out.println("----------------------------------");
        return "";
    }
}

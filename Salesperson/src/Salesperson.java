public class Salesperson {
    // Create a class named Salesperson. Data fields for Salesperson include
    // an integer ID number and a double annual sales amount. Methods include
    // a constructor that requires values for both data fields, as well as
    // get and set methods for each of the data fields.
    // Save the file as Salesperson.java

    private int idNumber;
    private double annualSales;

    public Salesperson(int idNumber, double annualSales) {
        this.idNumber = idNumber;
        this.annualSales = annualSales;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }
}

//****************************************************************************
//  Name: MrJ
//  Date: 9/26/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The AllInclusive class is the child class of the Vacation class.
//  It keeps track of details for all-inclusive vacations.
//****************************************************************************

public class AllInclusive extends Vacation {
    private String brand;
    private int starRating;
    private double price;

    //-----------------------------------------------------------------
    //  Default Constructor: Sets up this all-inclusive vacation using
    //  the default parameters.
    //-----------------------------------------------------------------
    public AllInclusive() {
        super();
        brand = "";
    }

    //-----------------------------------------------------------------
    //  Default Constructor: Sets up this all-inclusive vacation using
    //  the specified parameters.
    //-----------------------------------------------------------------
    public AllInclusive(String destination, String departureDate,
                        String returnDate, String brand) {
        super(destination, departureDate, returnDate);

        if (brand.length() > 0) {
            this.brand = brand;
        } else {
            this.brand = "";
        }
    }

    //***********************************************************************************
    //  Accessors (Getters)
    //***********************************************************************************
    public String getBrand() {
        return brand;
    }

    public int getRating() {
        return starRating;
    }

    //***********************************************************************************
    //  Mutators (Setters)
    //***********************************************************************************
    public void setBrand(String brand) {
        if (brand.length() > 0) {
            this.brand = brand;
        } else {
            this.brand = "";
        }
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            starRating = rating;
        } else {
            starRating = 0;
        }
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    //-----------------------------------------------------------------
    //  Returns information about this all-inclusive vacation as a string.
    //-----------------------------------------------------------------
    public String toString() {
        String starString = "";
        if (starRating > 0) {
            for (int i = 1; i <= starRating; i++) {
                starString += "*";
            }
        }

        return (super.toString() +
                "\nBrand: " + brand +
                "\nStar Rating: " + starString +
                "\nTotal Cost: $" + String.format("%,.2f", getTotalCost())
        );
    }

    //-----------------------------------------------------------------
    //  Returns the total cost for this all-inclusive vacation
    //-----------------------------------------------------------------
    public double getTotalCost() {
        return price;
    }
}

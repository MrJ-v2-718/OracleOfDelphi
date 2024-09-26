//****************************************************************************
//  Name: MrJ
//  Date: 9/26/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The Detailed class is the child class of the Vacation class.
//  It keeps track of details for detailed vacations, where airfare, hotel,
//  transfers, and meals are paid for separately.
//****************************************************************************

public class Detailed extends Vacation {
    private double hotel;
    private double airfare;
    private double meals;
    private double transfers;

    //-----------------------------------------------------------------
    //  Default Constructor: Sets up this detailed vacation using
    //  the default parameters.
    //-----------------------------------------------------------------
    public Detailed() {
        super();
        hotel = 0.0;
        airfare = 0.0;
        meals = 0.0;
        transfers = 0.0;
    }

    //-----------------------------------------------------------------
    //  Default Constructor: Sets up this all-inclusive vacation using
    //  the specified parameters.
    //-----------------------------------------------------------------
    public Detailed(String destination, String departureDate, String returnDate,
                    double hotel, double airfare, double meals, double transfers) {

        super(destination, departureDate, returnDate);

        if (hotel > 0.0) {
            this.hotel = hotel;
        } else {
            this.hotel = 0.0;
        }

        if (airfare > 0.0) {
            this.airfare = airfare;
        } else {
            this.airfare = 0.0;
        }

        if (meals > 0.0) {
            this.meals = meals;
        } else {
            this.meals = 0.0;
        }

        if (transfers > 0.0) {
            this.transfers = transfers;
        } else {
            this.transfers = 0.0;
        }
    }

    //***********************************************************************************
    //  Accessors (Getters)
    //***********************************************************************************
    public double getHotelCost() {
        return hotel;
    }

    public double getAirfareCost() {
        return airfare;
    }

    public double getMealCost() {
        return meals;
    }

    public double getTransfersCost() {
        return transfers;
    }

    //***********************************************************************************
    //  Mutators (Setters)
    //***********************************************************************************
    public void setHotelCost(double hotel) {
        if (hotel > 0.0) {
            this.hotel = hotel;
        } else {
            this.hotel = 0.0;
        }
    }

    public void setAirfareCost(double airfare) {
        if (airfare > 0.0) {
            this.airfare = airfare;
        } else {
            this.airfare = 0.0;
        }
    }

    public void setMealCost(double meals) {
        if (meals > 0.0) {
            this.meals = meals;
        } else {
            this.meals = 0.0;
        }
    }

    public void setTransfersCost(double transfers) {
        if (transfers > 0.0) {
            this.transfers = transfers;
        } else {
            this.transfers = 0.0;
        }
    }

    //-----------------------------------------------------------------
    //  Returns information about this detailed vacation as a string
    //-----------------------------------------------------------------
    public String toString() {
        return (super.toString() +
                "\nHotel Cost: $" + String.format("%,.2f", hotel) +
                "\nAirfare Cost: $" + String.format("%,.2f", airfare) +
                "\nMeal Cost: $" + String.format("%,.2f", meals) +
                "\nTransfers Cost: $" + String.format("%,.2f", transfers) +
                "\nTotal Cost: $" + String.format("%,.2f", getTotalCost())
        );
    }

    //-----------------------------------------------------------------
    //  Returns the total cost for this detailed vacation
    //-----------------------------------------------------------------
    public double getTotalCost() {
        return hotel + airfare + meals + transfers;
    }
}

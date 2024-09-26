//****************************************************************************
//  Name: MrJ
//  Date: 9/26/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The Vacation class serves as the abstract parent class for the
//  AllInclusive and Detailed classes. These all serve to keep track of
//  vacation details for all-inclusive and detailed vacations.
//****************************************************************************

abstract public class Vacation {
    protected String destination;
    protected String departureDate;
    protected String returnDate;

    //-----------------------------------------------------------------
    //  Default Constructor: Sets up this vacation using the
    //  default parameters.
    //-----------------------------------------------------------------
    public Vacation() {
        destination = "";
        departureDate = "";
        returnDate = "";
    }

    //-----------------------------------------------------------------
    //  Overloaded Constructor: Sets up this vacation using the
    //  specified parameters.
    //-----------------------------------------------------------------
    public Vacation(String destination, String departureDate, String returnDate) {
        if (destination.length() > 0) {
            this.destination = destination;
        } else {
            this.destination = "";
        }
        if (departureDate.length() > 0) {
            this.departureDate = departureDate;
        } else {
            this.departureDate = "";
        }
        if (returnDate.length() > 0) {
            this.returnDate = returnDate;
        } else {
            this.returnDate = "";
        }
    }

    //***********************************************************************************
    //  Accessors (Getters)
    //***********************************************************************************
    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    //***********************************************************************************
    //  Mutators (Setters)
    //***********************************************************************************
    public void setDestination(String destination) {
        if (destination.length() > 0) {
            this.destination = destination;
        } else {
            this.destination = "";
        }
    }

    public void setDepartureDate(String departureDate) {
        if (departureDate.length() > 0) {
            this.departureDate = departureDate;
        } else {
            this.departureDate = "";
        }
    }

    public void setReturnDate(String returnDate) {
        if (returnDate.length() > 0) {
            this.returnDate = returnDate;
        } else {
            this.returnDate = "";
        }
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic vacation information.
    //-----------------------------------------------------------------
    public String toString() {
        return ("\nDestination: " + destination +
                "\nDeparture Date: " + departureDate +
                "\nReturn Date: " + returnDate
        );
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the getTotalCost method for each
    //  type of vacation since it is an abstract method.
    //-----------------------------------------------------------------
    public abstract double getTotalCost();
}

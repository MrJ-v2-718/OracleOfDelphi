//****************************************************************************
//  Name: MrJ
//  Date: 9/26/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The TrackVacations class serves as the driver for the AllInclusive
//  and Detailed child classes. It will utilize the functionality of these classes
//  to instantiate and modify AllInclusive and Detailed objects.
//****************************************************************************

public class TrackVacations {

    public static void main(String[] args) {
        //***********************************************************************************
        //  Instantiation of AllInclusive and Detailed Objects to an Array of Vacation Objects
        //***********************************************************************************
        Vacation[] vacations = new Vacation[12];

        vacations[0] = new AllInclusive();
        vacations[0].setDestination("Tahiti");
        vacations[0].setDepartureDate("10/30/2024");
        vacations[0].setReturnDate("11/06/2024");
        ((AllInclusive) vacations[0]).setBrand("Expedia");
        ((AllInclusive) vacations[0]).setRating(4);
        ((AllInclusive) vacations[0]).setPrice(6549.99);

        vacations[1] = new AllInclusive();
        vacations[1].setDestination("Tokyo");
        vacations[1].setDepartureDate("11/06/2024");
        vacations[1].setReturnDate("11/13/2024");
        ((AllInclusive) vacations[1]).setBrand("Kayak");
        ((AllInclusive) vacations[1]).setRating(3);
        ((AllInclusive) vacations[1]).setPrice(8499.99);

        vacations[2] = new AllInclusive();
        vacations[2].setDestination("Cancun");
        vacations[2].setDepartureDate("12/22/2024");
        vacations[2].setReturnDate("12/29/2024");
        ((AllInclusive) vacations[2]).setBrand("Orbit");
        ((AllInclusive) vacations[2]).setRating(5);
        ((AllInclusive) vacations[2]).setPrice(8299.99);

        vacations[3] = new AllInclusive("London", "01/01/2025", "01/08/2025", "Expedia");
        ((AllInclusive) vacations[3]).setRating(2);
        ((AllInclusive) vacations[3]).setPrice(5549.99);

        vacations[4] = new AllInclusive("Paris", "01/08/2025", "01/15/2025", "Orbit");
        ((AllInclusive) vacations[4]).setRating(5);
        ((AllInclusive) vacations[4]).setPrice(11549.99);

        vacations[5] = new AllInclusive("Rome", "01/15/2025", "01/22/2025", "Kayak");
        ((AllInclusive) vacations[5]).setRating(3);
        ((AllInclusive) vacations[5]).setPrice(7549.99);

        vacations[6] = new Detailed();
        vacations[6].setDestination("Belize");
        vacations[6].setDepartureDate("10/28/2024");
        vacations[6].setReturnDate("11/04/2024");
        ((Detailed) vacations[6]).setHotelCost(999.99);
        ((Detailed) vacations[6]).setAirfareCost(499.99);
        ((Detailed) vacations[6]).setMealCost(549.99);
        ((Detailed) vacations[6]).setTransfersCost(249.99);

        vacations[7] = new Detailed();
        vacations[7].setDestination("Mexico City");
        vacations[7].setDepartureDate("10/20/2024");
        vacations[7].setReturnDate("10/26/2024");
        ((Detailed) vacations[7]).setHotelCost(499.99);
        ((Detailed) vacations[7]).setAirfareCost(299.99);
        ((Detailed) vacations[7]).setMealCost(249.99);
        ((Detailed) vacations[7]).setTransfersCost(149.99);

        vacations[8] = new Detailed();
        vacations[8].setDestination("Tegucigalpa");
        vacations[8].setDepartureDate("12/28/2024");
        vacations[8].setReturnDate("01/04/2025");
        ((Detailed) vacations[8]).setHotelCost(299.99);
        ((Detailed) vacations[8]).setAirfareCost(399.99);
        ((Detailed) vacations[8]).setMealCost(149.99);
        ((Detailed) vacations[8]).setTransfersCost(49.99);

        vacations[9] = new Detailed("Berlin", "01/01/2025", "01/08/2025", 899.99, 799.99, 549.95, 449.99);

        vacations[10] = new Detailed("Moscow", "01/08/2025", "01/15/2025", 599.99, 749.99, 349.95, 349.99);

        vacations[11] = new Detailed("Amsterdam", "01/15/2025", "01/22/2025", 799.99, 699.99, 449.95, 399.99);

        //***********************************************************************************
        //  Display of Vacation Objects
        //***********************************************************************************
        System.out.println("\n*********************Instantiated Vacations*********************");
        for (int i = 0; i < vacations.length; i++) {
            System.out.println(vacations[i].toString());
        }

        System.out.println("\n***********************Polymorphism Loop************************");
        String display;
        for (int i = 0; i < vacations.length; i++) {
            display = "\nDestination: " + vacations[i].getDestination() +
                    "\nDeparture Date: " + vacations[i].getDepartureDate() +
                    "\nReturn Date: " + vacations[i].getReturnDate() +
                    "\nTotal Cost: $" + String.format("%,.2f", vacations[i].getTotalCost());
            System.out.println(display);
        }
    }
}

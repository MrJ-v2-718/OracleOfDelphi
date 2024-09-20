//****************************************************************************
//  Name: MrJ
//  Date: 9/20/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The AA class is the child class of the Degree class. It keeps
//  track of specific requirements for the Associate in Art degree.
//****************************************************************************

public class AA extends Degree {

    //***********************************************************************************
    //  Instance Variables
    //***********************************************************************************

    private int foreignLanguageHours;
    private int AAhours;

    //***********************************************************************************
    //  Constructors
    //***********************************************************************************

    public AA() {
        super("AA", 0, 0);
        AAhours = 0;
        foreignLanguageHours = 0;
    }

    public AA(int genEdHours, int electiveHours, int AAhours, int foreignLanguageHours) {
        super("AA", genEdHours, electiveHours);

        if (AAhours >= 0 && AAhours <= 60) {
            this.AAhours = AAhours;
        } else {
            this.AAhours = 0;
        }

        if (foreignLanguageHours >= 0 && foreignLanguageHours <= 60) {
            this.foreignLanguageHours = foreignLanguageHours;
        } else {
            this.foreignLanguageHours = 0;
        }
    }

    //***********************************************************************************
    //  Accessors For Child Class
    //***********************************************************************************

    public int getForeignLangHours() {
        return foreignLanguageHours;
    }

    public int getAAhours() {
        return AAhours;
    }

    //***********************************************************************************
    //  Additional Methods
    //***********************************************************************************

    public void addFLHours(int hours) {
        if (hours >= 0) {
            foreignLanguageHours += hours;
        }
    }

    public void addAAHours(int hours) {
        if (hours >= 0) {
            AAhours += hours;
        }
    }

    public String toString() {
        return (super.toString() + "\nAA Hours: " + AAhours +
                "\nForeign Language Hours: " + foreignLanguageHours);
    }

    @Override
    public int calcTotalHours() {
        return genEdHours + electiveHours + AAhours + foreignLanguageHours;
    }
}

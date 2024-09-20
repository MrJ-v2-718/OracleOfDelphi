//****************************************************************************
//  Name: MrJ
//  Date: 9/20/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The AS class is the child class of the Degree class. It keeps
//  track of specific requirements for the Associate in Science degree.
//****************************************************************************

public class AS extends Degree {

    //***********************************************************************************
    //  Instance Variables
    //***********************************************************************************

    private int AShours;
    private String focusArea;
    private int focusHours;

    //***********************************************************************************
    //  Constructors
    //***********************************************************************************

    public AS() {
        super("AS", 0, 0);
        focusArea = "";
        AShours = 0;
        focusHours = 0;
    }

    public AS(int genEdHours, int electiveHours, int AShours, String focusArea, int focusHours) {
        super("AS", genEdHours, electiveHours);

        if (AShours >= 0 && AShours <= 60) {
            this.AShours = AShours;
        } else {
            this.AShours = 0;
        }

        this.focusArea = focusArea;

        if (focusHours >= 0 && focusHours <= 60) {
            this.focusHours = focusHours;
        } else {
            this.focusHours = 0;
        }
    }

    //***********************************************************************************
    //  Accessors For Child Class
    //***********************************************************************************

    public int getAShours() {
        return AShours;
    }

    public String getFocusArea() {
        return focusArea;
    }

    public int getFocusHours() {
        return focusHours;
    }

    //***********************************************************************************
    //  Mutators For Child Class
    //***********************************************************************************

    public void setFocusArea(String focusArea) {
        this.focusArea = focusArea;
    }

    //***********************************************************************************
    //  Additional Methods
    //***********************************************************************************

    public void addASHours(int hours) {
        if (hours >= 0) {
            AShours += hours;
        }
    }

    public void addFocusHours(int hours) {
        if (hours >= 0) {
            focusHours += hours;
        }
    }

    public String toString() {
        return (super.toString() + "\nAS Hours: " + AShours + "\nFocus Area: " +
                focusArea + "\nFocus Hours: " + focusHours);
    }

    @Override
    public int calcTotalHours() {
        return genEdHours + electiveHours + AShours + focusHours;
    }
}

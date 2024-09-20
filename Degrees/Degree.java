//****************************************************************************
//  Name: MrJ
//  Date: 9/20/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The Degree class serves as the abstract parent class for the AA,
//  AS, and AAS classes. These all serve to keep track of degree requirements
//  for their corresponding degree.
//****************************************************************************

public abstract class Degree {

    //***********************************************************************************
    //  Instance Variables
    //***********************************************************************************

    protected String degree;
    protected String description;
    protected int genEdHours;
    protected int electiveHours;

    //***********************************************************************************
    //                                Constructors
    //  Default constructor sets degree to AS, description to Associate in Science, and
    //  sets genEdHours and electiveHours to 0. The overloaded constructor accepts a
    //  String for degree and an integer for genEdHours and electiveHours.
    //***********************************************************************************

    public Degree() {
        degree = "AS";
        description = "Associate in Science";
        genEdHours = 0;
        electiveHours = 0;
    }

    public Degree(String degree, int genEdHours, int electiveHours) {
        if (degree.equals("AA")) {
            this.degree = degree;
            description = "Associate in Art";
        } else if (degree.equals("AS")) {
            this.degree = degree;
            description = "Associate in Science";
        } else if (degree.equals("AAS")) {
            this.degree = degree;
            description = "Associate in Applied Science";
        } else {
            this.degree = "AS";
            description = "Associate in Applied Science";
        }

        if (genEdHours >= 0 && genEdHours <= 60) {
            this.genEdHours = genEdHours;
        } else {
            this.genEdHours = 0;
        }

        if (electiveHours >= 0 && electiveHours <= 60) {
            this.electiveHours = electiveHours;
        } else {
            this.electiveHours = 0;
        }
    }

    //***********************************************************************************
    //  Accessors
    //***********************************************************************************

    public String getDegree() {
        return degree;
    }

    public String getDescription() {
        return description;
    }

    public int getGenEdHours() {
        return genEdHours;
    }

    public int getElectiveHours() {
        return electiveHours;
    }

    //***********************************************************************************
    //  Mutators
    //***********************************************************************************

    public void setDescription(String description) {
        this.description = description;
    }

    //***********************************************************************************
    //  Additional Methods
    //***********************************************************************************

    public String toString() {
        return ("\nDegree: " + degree + "\nDescription: " + description +
                "\nGeneral Education Hours: " + genEdHours + "\nElective Hours: " + electiveHours);
    }

    public void addGenEdHours(int hours) {
        if (hours >= 0) {
            genEdHours += hours;
        }
    }

    public void addElectiveHours(int hours) {
        if (hours >= 0) {
            electiveHours += hours;
        }
    }

    abstract int calcTotalHours();
}

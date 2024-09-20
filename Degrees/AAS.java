//****************************************************************************
//  Name: MrJ
//  Date: 9/20/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The AAS class is the child class of the Degree class. It keeps
//  track of specific requirements for the Associate in Applied Science degree.
//****************************************************************************

public class AAS extends Degree {

    //***********************************************************************************
    //  Instance Variables
    //***********************************************************************************

    private int AASCoreHours;
    private String track;
    private int trackHours;

    //***********************************************************************************
    //  Constructors
    //***********************************************************************************

    public AAS() {
        super("AAS", 0, 0);
        AASCoreHours = 0;
        track = "";
        trackHours = 0;
    }

    public AAS(int genEdHours, int electiveHours, int AASCoreHours, String track, int trackHours) {
        super("AAS", genEdHours, electiveHours);
        this.AASCoreHours = AASCoreHours;
        this.track = track;
        this.trackHours = trackHours;
    }

    //***********************************************************************************
    //  Accessors For Child Class
    //***********************************************************************************

    public int getCoreHours() {
        return AASCoreHours;
    }

    public String getTrack() {
        return track;
    }

    public int getTrackHours() {
        return trackHours;
    }


    //***********************************************************************************
    //  Mutators For Child Class
    //***********************************************************************************

    public void setTrack(String track) {
        this.track = track;
    }

    //***********************************************************************************
    //  Additional Methods
    //***********************************************************************************

    public void addCoreHours(int hours) {
        if (hours >= 0) {
            AASCoreHours += hours;
        }
    }

    public void addTrackHours(int hours) {
        if (hours >= 0) {
            trackHours += hours;
        }
    }

    public String toString() {
        return (super.toString() + "\nAAS Hours: " + AASCoreHours +
                "\nTrack: " + track + "\nTrack Hours: " + trackHours);
    }

    @Override
    public int calcTotalHours() {
        return genEdHours + electiveHours + AASCoreHours + trackHours;
    }
}

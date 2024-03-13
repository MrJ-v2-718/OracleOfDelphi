public class Apartment {
    private int aptNumber;
    private int bedrooms;
    private int baths;
    private double rent;

    public Apartment() {

    }

    public Apartment(int aptNumber, int bedrooms, int baths, double rent) {
        this.aptNumber = aptNumber;
        this.bedrooms = bedrooms;
        this.baths = baths;
        this.rent = rent;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBaths() {
        return baths;
    }

    public double getRent() {
        return rent;
    }
}

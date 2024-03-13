public class Automobile {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    private double mpg;

    public Automobile(int id, String make, String model, String color,
                      int year, double mpg) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mpg = mpg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if ((id < 0) || (id > 9999)) {
            this.id = 0;
        } else {
            this.id = id;
        }

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if ((year < 2005) || (year > 2024)) {
            this.year = 0;
        } else {
            this.year = year;
        }

    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        if ((mpg < 10) || (mpg > 60)) {
            this.mpg = 0;
        } else {
            this.mpg = mpg;
        }

    }
}

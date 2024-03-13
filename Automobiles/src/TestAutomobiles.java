import java.util.Scanner;

public class TestAutomobiles {
    public static void main(String[] args) {
        int id;
        String make;
        String model;
        String color;
        int year;
        double mpg;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID#: ");
        id = input.nextInt();

        input.nextLine();

        System.out.print("Enter make: ");
        make = input.nextLine();

        System.out.print("Enter model: ");
        model = input.nextLine();

        System.out.print("Enter color: ");
        color = input.nextLine();

        System.out.print("Enter year: ");
        year = input.nextInt();

        System.out.print("Enter mpg: ");
        mpg = input.nextDouble();

        Automobile automobile1 = new Automobile(id, make, model, color, year, mpg);
        automobile1.setId(id);
        automobile1.setMake(make);
        automobile1.setModel(model);
        automobile1.setColor(color);
        automobile1.setYear(year);
        automobile1.setMpg(mpg);

        System.out.print("Enter ID#: ");
        id = input.nextInt();

        input.nextLine();

        System.out.print("Enter make: ");
        make = input.nextLine();

        System.out.print("Enter model: ");
        model = input.nextLine();

        System.out.print("Enter color: ");
        color = input.nextLine();

        System.out.print("Enter year: ");
        year = input.nextInt();

        System.out.print("Enter mpg: ");
        mpg = input.nextDouble();

        Automobile automobile2 = new Automobile(id, make, model, color, year, mpg);
        automobile2.setId(id);
        automobile2.setMake(make);
        automobile2.setModel(model);
        automobile2.setColor(color);
        automobile2.setYear(year);
        automobile2.setMpg(mpg);

        System.out.println();
        System.out.println("Automobile 1");
        System.out.println("******************");
        System.out.println("ID#: " + automobile1.getId());
        System.out.println("Make: " + automobile1.getMake());
        System.out.println("Model: " + automobile1.getModel());
        System.out.println("Color: " + automobile1.getColor());
        System.out.println("Year: " + automobile1.getYear());
        System.out.println("Mpg: " + automobile1.getMpg());
        System.out.println("ID#" + automobile1.getId() + " " +
                automobile1.getMake() + " " + automobile1.getModel() +
                " " + automobile1.getColor() + " " + automobile1.getYear() +
                " " + automobile1.getMpg() + " miles per gallon");

        System.out.println();
        System.out.println("Automobile 2");
        System.out.println("******************");
        System.out.println("ID#: " + automobile2.getId());
        System.out.println("Make: " + automobile2.getMake());
        System.out.println("Model: " + automobile2.getModel());
        System.out.println("Color: " + automobile2.getColor());
        System.out.println("Year: " + automobile2.getYear());
        System.out.println("Mpg: " + automobile2.getMpg());
        System.out.println("ID#" + automobile2.getId() + " " +
                automobile2.getMake() + " " + automobile2.getModel() +
                " " + automobile2.getColor() + " " + automobile2.getYear() +
                " " + automobile2.getMpg() + " miles per gallon");
    }
}

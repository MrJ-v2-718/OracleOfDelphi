public class DemoSalesperson {
    public static void main(String[] args) {
        // Write an application named DemoSalesperson that declares an array of 10
        // Salesperson objects named salesPeople. Set each ID number to 9999 and
        // each sales value to zero. Display the 10 Salesperson objects.
        // Save the file as DemoSalesperson.java

        Salesperson[] salesPeople = new Salesperson[10];
        System.out.println();

        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i] = new Salesperson(9999, 0);
        }

        for (int i = 0; i < salesPeople.length; i++) {
            System.out.println("Object Reference: " + salesPeople[i]);
            System.out.println("ID Number: " + salesPeople[i].getIdNumber());
            System.out.println("Annual Sales: " + salesPeople[i].getAnnualSales());
            System.out.println();
        }
    }
}

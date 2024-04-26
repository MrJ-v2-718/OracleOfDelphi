public class DemoSalesperson2 {
    public static void main(String[] args) {
        // Modify the DemoSalesperson application so each Salesperson has a successive
        // ID number from 111 through 120 and a sales value that ranges from $25,000
        // to $70,000, increasing by $5,000 for each successive Salesperson.
        // Save the file as DemoSalesperson2.java

        Salesperson[] salesPeople = new Salesperson[10];
        int idNumber = 111;
        double annualSales = 25000.0;

        System.out.println();

        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i] = new Salesperson(idNumber, annualSales);
            idNumber++;
            annualSales += 5000.0;
        }

        for (int i = 0; i < salesPeople.length; i++) {
            System.out.println("Object Reference: " + salesPeople[i]);
            System.out.println("ID Number: " + salesPeople[i].getIdNumber());
            System.out.println("Annual Sales: " + salesPeople[i].getAnnualSales());
            System.out.println();
        }
    }
}

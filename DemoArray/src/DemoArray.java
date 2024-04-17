public class DemoArray {

    public static void main(String[] args) {
        // Array of size four declared
        double[] salaries = new double[4];

        // Starts at index(subscript) 0 in Java
        salaries[0] = 16.25;
        salaries[1] = 17.55;
        salaries[2] = 18.25;
        salaries[3] = 19.85;

        System.out.println("Salaries one by one are: ");
        System.out.println(salaries[0]);
        System.out.println(salaries[1]);
        System.out.println(salaries[2]);
        System.out.println(salaries[3]);
        // The statement below will generate an out-of-bounds error
        //System.out.println(salaries[4]);
    }
}

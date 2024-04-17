public class DemoArray3 {

    public static void main(String[] args) {
        // Array of size four declared
        double[] salaries = {16.25, 17.55, 18.25, 19.85};

        // Starts at index(subscript) 0 in Java
        System.out.println("Salaries one by one are: ");
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }
        // The statement below will generate an out-of-bounds error
        //System.out.println(salaries[4]);
    }
}

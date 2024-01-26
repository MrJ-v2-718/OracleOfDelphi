import javax.swing.JOptionPane;

public class DialogBox {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Think of a number between one and ten.");
        JOptionPane.showMessageDialog(null, "The number is " +
        (1 + (int)(Math.random() * 10)) + ".");
    }
}

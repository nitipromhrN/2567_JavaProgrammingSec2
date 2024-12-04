import javax.swing.JOptionPane;

public class Labsheet3 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input Time Parking (minute):");
        int minutes = Integer.parseInt(input);

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        double totalCost = (hours * 50) + (remainingMinutes * 0.25);

        String message = "You parking " + hours + " Hour " + remainingMinutes + " Minute.\n"
                       + "Amount to be paid is " + totalCost + " baht.";
        JOptionPane.showMessageDialog(null, message);
    }
}
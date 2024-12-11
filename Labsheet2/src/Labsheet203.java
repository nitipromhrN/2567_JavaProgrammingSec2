import javax.swing.*;

public class Labsheet203 {
	
    public static void main(String[] args) {

        String weightInput = JOptionPane.showInputDialog("Input Weight (kg):");
        double weight = Double.parseDouble(weightInput);

        String heightInput = JOptionPane.showInputDialog("Input Height (cm):");
        double heightCm = Double.parseDouble(heightInput);

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "You're Underweight";
        } else if (bmi < 25) {
            status = "You're Normal-weight";
        } else if (bmi < 30) {
            status = "You're Over-weight";
        } else {
            status = "You're Obesity";
        }

        JOptionPane.showMessageDialog(null, String.format("BMI = %.1f\n%s", bmi, status), "BMI", JOptionPane.WARNING_MESSAGE);
    }
}
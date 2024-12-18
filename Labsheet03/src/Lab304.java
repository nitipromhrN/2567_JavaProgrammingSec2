import javax.swing.JOptionPane;

public class Lab304 {
    public static void main(String[] args) {
        while (true) {
            String fullName = JOptionPane.showInputDialog(null, "Full name (FirstName LastName):", "Input", JOptionPane.QUESTION_MESSAGE);
            if (fullName == null || fullName.trim().isEmpty()) {
            }
            
            fullName = fullName.trim();
            int spaceIndex = fullName.indexOf(" ");

            if (spaceIndex != -1 && spaceIndex != fullName.length() - 1) {
                String firstName = fullName.substring(0, spaceIndex);
                String lastName = fullName.substring(spaceIndex + 1);
                JOptionPane.showMessageDialog(null, 
                    "Full Name: " + firstName + " " + lastName + "\n" +
                    "First Name: " + firstName.toUpperCase() + "\n" +
                    "Last Name: " + lastName, 
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Incorrect Name", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}


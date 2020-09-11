import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class makkelijke_gui extends JFrame implements ActionListener {

private JTextField textField; //declaratie
private JLabel label;

public static void main(String[] args) {
    makkelijke_gui frame = new makkelijke_gui();
        frame.setSize(500, 500);
        frame.createGUI();
        frame.setVisible(true);
        }

private void createGUI() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        label = new JLabel("Voer hier iets in");

        window.add(label);
        textField = new JTextField("geef hier input"); // Initiatie
        textField.setBackground(Color.yellow);
        window.add(textField);
        }

public void actionPreformed(ActionEvent event){
        System.out.println("Hellow world");
        textField.setText("Hellow World");

        }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


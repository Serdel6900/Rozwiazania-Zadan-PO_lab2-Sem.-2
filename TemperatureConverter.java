import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {

    private JTextField textField1;
    private JButton konwertujButton;
    private JPanel MainPanel;

    public TemperatureConverter() {
        super("Konwerter temperatury");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel labelCelsius = new JLabel("Temperatura °C:");
        JTextField fieldCelsius = new JTextField(10);
        JButton buttonConvert = new JButton("Konwertuj");
        JLabel labelResult = new JLabel("Wynik: --- °F");

        add(labelCelsius);
        add(fieldCelsius);
        add(buttonConvert);
        add(labelResult);

        buttonConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(fieldCelsius.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    labelResult.setText("Wynik: " + fahrenheit + " °F");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Podaj poprawną liczbę!");
                }
            }
        });

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}

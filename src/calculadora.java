import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JTextField numero1;
    private JTextField numero2;
    private JButton sumar;
    private JButton restar;
    private JButton multiplicar;
    private JButton dividir;
    private JPanel mainPanel;
    private JLabel lb;

    public Container mainPanel() {
        return mainPanel;
    }

    public calculadora() {
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1= Double.parseDouble(numero1.getText());
                double num2= Double.parseDouble(numero2.getText());
                double suma = num1 + num2;

                lb.setText("El resultado es: " + suma);
            }
        });
        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1= Double.parseDouble(numero1.getText());
                double num2= Double.parseDouble(numero2.getText());
                double resta = num1 - num2;

                lb.setText("El resultado es: " + resta);
            }
        });
        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1= Double.parseDouble(numero1.getText());
                double num2= Double.parseDouble(numero2.getText());
                double multiplicacion = num1 * num2;

                lb.setText("El resultado es: " + multiplicacion);
            }
        });
        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1= Double.parseDouble(numero1.getText());
                double num2= Double.parseDouble(numero2.getText());
                if (num2 == 0) {
                    lb.setText("Cero no se puede pa");
                }
                else {
                    lb.setText("El resultado es: " + num1 / num2);
                }

            }
        });
    }


}

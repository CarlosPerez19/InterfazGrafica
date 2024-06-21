import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton BotonOK;
    public JPanel panel1;
    private JLabel lb;
    private JButton BotonCancelar;

    public Container panel1 () {
        return panel1;
    }

    public form1 () {

        BotonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lb.setText("DNeekoD");
            }
        });
        BotonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lb.setText(null);
            }
        });
    }
}

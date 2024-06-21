import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaLogin {
    private JPanel login;
    private JTextField usuario;
    private JPasswordField contraseña;
    private JButton okButton;
    private JButton borrarButton;
    private JLabel lbcontra;
    private JLabel lbusuario;

    public PantallaLogin() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = "Java";
                String password = "java.123";

                String user_1 = usuario.getText();
                String password_1 = contraseña.getText();

                if (user.equals(user_1) && password.equals(password_1)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Usuario no valido");
                }
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario.setText(null);
                contraseña.setText(null);
            }
        });
    }

    public Container login () {
        return login;
    }

}

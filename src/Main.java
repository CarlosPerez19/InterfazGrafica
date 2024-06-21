import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        String primerNumero = JOptionPane.showInputDialog("Ingrese el primer numero");
        String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo numero");

        int n1 = Integer.parseInt(primerNumero);
        int n2 = Integer.parseInt(segundoNumero);
        int resultado = n1 + n2;
        int resultado2 = n1 - n2;
        int resultado3 = n1 * n2;
        int resultado4 = n1 / n2;

        JOptionPane.showMessageDialog(null, "La suma de:" + n1 + "+" + n2 + "=" + resultado);
        JOptionPane.showMessageDialog(null, "La resta de:" + n1 + "-" + n2 + "=" + resultado2);
        JOptionPane.showInputDialog(null, "La multiplicacion de:" + n1 + "*" + n2 + "=" + resultado3);
        JOptionPane.showInputDialog(null, "La division de:" + n1 + "/" + n2 + "=" + resultado4);

         */
        /*
        JFrame frame = new JFrame("Mi aplicacion");
        frame.setContentPane(new form1().panel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        */

        /*
        JFrame frame2 = new JFrame("Calculadora");
        frame2.setContentPane(new calculadora().mainPanel());
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setSize(600, 400);
        frame2.setVisible(true);
         */

        JFrame frame3 = new JFrame();
        frame3.setContentPane(new PantallaLogin().login());
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(800, 600);
        frame3.pack();
        frame3.setVisible(true);
    }
}
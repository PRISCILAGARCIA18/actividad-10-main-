import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSimple extends JFrame {
    private JTextField textFieldNumero1;
    private JTextField textFieldNumero2;
    private JLabel labelResultado;
    private JButton buttonSuma, buttonResta, buttonMultiplicacion, buttonDivision;

    public CalculadoraSimple() {
        setTitle("Calculadora Básica");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        textFieldNumero1 = new JTextField();
        textFieldNumero2 = new JTextField();
        labelResultado = new JLabel("Resultado: ");
        buttonSuma = new JButton("+");
        buttonResta = new JButton("-");
        buttonMultiplicacion = new JButton("*");
        buttonDivision = new JButton("/");


        textFieldNumero1.setBounds(30, 20, 100, 30);
        textFieldNumero2.setBounds(150, 20, 100, 30);
        labelResultado.setBounds(30, 120, 200, 30);
        buttonSuma.setBounds(30, 70, 50, 30);
        buttonResta.setBounds(90, 70, 50, 30);
        buttonMultiplicacion.setBounds(150, 70, 50, 30);
        buttonDivision.setBounds(210, 70, 50, 30);


        add(textFieldNumero1);
        add(textFieldNumero2);
        add(labelResultado);
        add(buttonSuma);
        add(buttonResta);
        add(buttonMultiplicacion);
        add(buttonDivision);

        
        buttonSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('+');
            }
        });
        buttonResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('-');
            }
        });
        buttonMultiplicacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('*');
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular('/');
            }
        });
    }

    private void calcular(char operacion) {
        double num1 = Double.parseDouble(textFieldNumero1.getText());
        double num2 = Double.parseDouble(textFieldNumero2.getText());
        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num2 != 0 ? num1 / num2 : 0;
                break;
        }
        labelResultado.setText("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        CalculadoraSimple calculadora = new CalculadoraSimple();
        calculadora.setVisible(true);
    }
}

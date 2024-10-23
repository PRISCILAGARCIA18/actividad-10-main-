import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el peso (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Ingrese la altura (m): ");
            double altura = sc.nextDouble();


            Persona persona = new Persona(nombre, peso, altura);
            System.out.println(persona.getNombre() + " tiene un IMC de: " + persona.calcularIMC());

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingreso inválido. Por favor, ingrese valores numéricos para peso y altura.");
        } finally {
            sc.close();
        }
    }
}
class Persona {

    private String nombre;
    private double peso; // En kilogramos
    private double altura; // En metros

    // Constructor
    public Persona(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public String calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}

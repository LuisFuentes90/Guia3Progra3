package calculadora;

public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return a / b;
    }

    public static double raizCuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede sacar raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}

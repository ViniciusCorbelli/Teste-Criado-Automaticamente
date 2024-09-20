package ufjf.br;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("Erro");
        return (double) a / b;
    }

    public int somarError(int a, int b) {
        return a - b; // Erro intencional
    }

    public int subtrairError(int a, int b) {
        return a + b; // Erro intencional
    }

    public int multiplicarError(int a, int b) {
        return a / b; // Erro intencional
    }

    public double dividirError(int a, int b) {
        return (double) a / b; // Erro intencional
    }
}

package entities;

public class Operacoes {
    double numero1;
    double numero2;

    public Operacoes() {
    }

    public Operacoes(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public double getNumero1() {
        return numero1;
    }

    public double soma (double numero1, double numero2) {
        return numero1 + numero2;
    }
    public double subtrai (double numero1, double numero2) {
        return numero1 - numero2;
    }
    public double multiplica (double numero1, double numero2) {
        return numero1 * numero2;
    }
    public double divide (double numero1, double numero2) {
        return numero1 / numero2;
    }
    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }
}

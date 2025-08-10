public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public double area() {
        return largura * altura;
    }
}

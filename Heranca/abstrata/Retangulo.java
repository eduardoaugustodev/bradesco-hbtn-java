public abstract class Retangulo extends FormaGeometrica {
    protected double largura;
    protected double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public abstract double area();
}

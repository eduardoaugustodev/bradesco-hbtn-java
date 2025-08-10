public class Gerente extends Empregado {
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        // Exemplo: bônus de 20% do salário fixo se meta atingida, senão 0
        if (departamento.alcancouMeta()) {
            return getSalarioFixo() * 0.2;
        } else {
            return 0.0;
        }
    }
}

package ClasseAbstrata;

public class Coordenador extends Funcionario implements Trabalhavel {

    private String departamento;

    public Coordenador() {
    }

    public Coordenador(String nome, int matricula, float valorHora, int horasTrabalhadas, String departamento) {
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public float calcularSalario() {
        return (getValorHora() * getHorasTrabalhadas()) + 1500;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Coordenador" +
                "\nDepartamento: " + departamento +
                "\nSalário: R$ " + calcularSalario();
    }

    @Override
    public String trabalhar() {
        return "O coordenador " + getNome() + " está coordenando o departamento " + getDepartamento();
    }

    @Override
    public String relatarProgresso() {
        return getNome() + " relatou que o departamento " + getDepartamento() + " está progredindo bem.";
    }
}

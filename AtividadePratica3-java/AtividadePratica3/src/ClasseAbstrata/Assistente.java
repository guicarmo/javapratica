package ClasseAbstrata;

public class Assistente extends Funcionario implements Trabalhavel {

    private String departamento;

    public Assistente() {
    }

    public Assistente(String nome, int matricula, float valorHora, int horasTrabalhadas,
        String departamento) {
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
        return getHorasTrabalhadas() * getValorHora();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Assistente" +
                "\nDepartamento: " + departamento +
                "\nSalário: R$ " + calcularSalario();
    }

    @Override
    public String trabalhar() {
        return "O assistente " + getNome() + " está trabalhando no departamento de " + departamento;
    }

    @Override
    public String relatarProgresso() {
        return "O assistente " + getNome() + " está reportando o progresso do trabalho no departamento de " + departamento;
    }
}

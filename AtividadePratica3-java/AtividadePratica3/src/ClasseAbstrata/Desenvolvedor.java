package ClasseAbstrata;

public class Desenvolvedor extends Funcionario implements Trabalhavel {

    private String linguagemDominante;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, int matricula, float valorHora, int horasTrabalhadas, String linguagemDominante) {
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.linguagemDominante = linguagemDominante;
    }

    public String getLinguagemDominante() {
        return linguagemDominante;
    }

    public void setLinguagemDominante(String linguagemDominante) {
        this.linguagemDominante = linguagemDominante;
    }

    @Override
    public float calcularSalario() {
        // Por exemplo, considerando um adicional para desenvolvedores experientes
        if (getHorasTrabalhadas() > 160) {
            return (getValorHora() * 160) + 500;
        } else {
            return getValorHora() * getHorasTrabalhadas();
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Desenvolvedor" +
                "\nLinguagem Dominante: " + linguagemDominante +
                "\nSalário: R$ " + calcularSalario();
    }

    @Override
    public String trabalhar() {
        return "O desenvolvedor " + getNome() + " está trabalhando com " + getLinguagemDominante();
    }

    @Override
    public String relatarProgresso() {
        return getNome() + " relatou progresso no desenvolvimento em " + getLinguagemDominante();
    }
}
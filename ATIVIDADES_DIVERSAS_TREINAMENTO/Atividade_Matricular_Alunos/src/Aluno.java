public class Aluno {
    private String nome;
    private String serie;
    private int matricula;
    private PeriodoDia periodoDia;

    public Aluno(String nome, String serie, int matricula, PeriodoDia periodoDia) {
        this.nome = nome;
        this.serie = serie;
        this.matricula = matricula;
        this.periodoDia = periodoDia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public PeriodoDia getPeriodoDia() {
        return periodoDia;
    }

    public void setPeriodoDia(PeriodoDia periodoDia) {
        this.periodoDia = periodoDia;
    }

    @Override
    public String toString() {
        return "\nALUNO MATRICULADO - "+ "NOME: " + nome + '\'' +
                ", SÉRIE: " + serie + '\'' +
                ", MATRÍCULA: " + matricula +
                ", PERIODO: " + periodoDia;
    }
}

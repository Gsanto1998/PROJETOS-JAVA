public enum PeriodoDia {
    MANHA(5,"Manhã"), TARDE(5,"Tarde"), NOITE(2,"Noite");

    private int quantidadDeAlunos;
    private String periodo;

    PeriodoDia(int quantidadDeAlunos, String periodo) {
        this.quantidadDeAlunos = quantidadDeAlunos;
        this.periodo = periodo;
    }

    public int getQuantidadDeAlunos() {
        return quantidadDeAlunos;
    }

    public void setQuantidadDeAlunos(int quantidadDeAlunos) {
        this.quantidadDeAlunos = quantidadDeAlunos;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}

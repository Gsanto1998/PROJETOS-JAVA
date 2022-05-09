public class Main {
    public static void main(String[] args) {
        RegistrarAluno registrarAluno = new RegistrarAluno();
        registrarAluno.registrarAlunos(new Aluno("Guilherme Camargos Santos","Terceira",1542,PeriodoDia.MANHA));
        registrarAluno.registrarAlunos(new Aluno("Guilherme Camargos Santos","Terceira",1542,PeriodoDia.MANHA));
        registrarAluno.registrarAlunos(new Aluno("Guilherme Camargos Santos","Terceira",1542,PeriodoDia.MANHA));
        registrarAluno.registrarAlunos(new Aluno("Guilherme Camargos Santos","Terceira",1542,PeriodoDia.MANHA));
        registrarAluno.registrarAlunos(new Aluno("Guilherme Camargos Santos","Terceira",1542,PeriodoDia.MANHA));
        registrarAluno.registrarAlunos(new Aluno("Ferson Feren Feril","Terceira",1542,PeriodoDia.MANHA));
        registrarAluno.registrarAlunos(new Aluno("Farel Firel Forel","Terceira",1542,PeriodoDia.MANHA));
        registrarAluno.registrarAlunos(new Aluno("Bruna Camargos Santos","Seguda",1784,PeriodoDia.TARDE));
        registrarAluno.registrarAlunos(new Aluno("Roberto Adbistal batista","Fundamental",1784,PeriodoDia.TARDE));
        registrarAluno.registrarAlunos(new Aluno("Ronaldo Roman Roberto","Primeira",1784,PeriodoDia.TARDE));
        registrarAluno.registrarAlunos(new Aluno("Rogerio Rogal Ronder","Seguda",1784,PeriodoDia.TARDE));
        registrarAluno.registrarAlunos(new Aluno("Baristel Baris Johnson","Seguda",1784,PeriodoDia.TARDE));
        registrarAluno.registrarAlunos(new Aluno("Romulo Romal Roger","Seguda",1784,PeriodoDia.TARDE));
        registrarAluno.registrarAlunos(new Aluno("Werley Weril Weds","Seguda",1784,PeriodoDia.TARDE));
        registrarAluno.registrarAlunos(new Aluno("Melquiedes Melquer Malibull","Primeira",1452,PeriodoDia.NOITE));
        registrarAluno.registrarAlunos(new Aluno("Mailton AMriste marel","Terceira",1247,PeriodoDia.NOITE));
        registrarAluno.registrarAlunos(new Aluno("Yuri rodson Dorico","Primeira",1452,PeriodoDia.NOITE));
        registrarAluno.registrarAlunos(new Aluno("Dorico Doris Deril","Terceira",1452,PeriodoDia.NOITE));

        System.out.println(registrarAluno.listaAlunos.toString()+ "\nQuantidade de alunos matriculados: "+registrarAluno.listaAlunos.size()+"\nQuantidade de " +
                "alunos sem matricula: "+registrarAluno.semMatricula);
    }
}

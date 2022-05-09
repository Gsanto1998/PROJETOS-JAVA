import java.util.ArrayList;

public class RegistrarAluno {

    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    int alunosRigistrados = 0;
    int semMatricula = 0;

    public void registrarAlunos(Aluno aluno) {
        int limiteUltimoFila = 10;
        alunosRigistrados++;
        if (listaAlunos.isEmpty()) {
            listaAlunos.add(aluno);
            //PRIMEIRO NOME DIGITADO SEMPRE SERA INSERIDO NA LISTA;
        }

        for (Aluno percorrerListaAlunos : listaAlunos) {
            if (percorrerListaAlunos.getPeriodoDia().name().equals(aluno.getPeriodoDia().name())) {
                limiteUltimoFila = percorrerListaAlunos.getPeriodoDia().getQuantidadDeAlunos() - 1;
            }
            //ESSE FOR EACH PERCORRE TODA LISTA COMPARANDO O ALUNO ATUAL COM O ALUNO ANTERIOR, SE O ALUNO ATUAL ESTUDAR NO MESMO TURNO QUE OS ANTERIORES ELE ACESSA
            // A QUANTIDADE DISPONIVEL DO TURNO E SUBTRAI POR MENOS 1;
        }
        if (limiteUltimoFila >= 0) {
            if (limiteUltimoFila == 10) {
                limiteUltimoFila = aluno.getPeriodoDia().getQuantidadDeAlunos() - 1;
                //SE O PERIODO DO ALUNO ATUAL NÃO FOR IGUAL AO DOS ALUNOS ANTERIORES O 'limiteUltimoFila' PASSA A SER O LIMITE TOTAL DO SEU TURNO
                // (OU SEJA, ESTA INSERINDO UM ALUNO EM UM TURNO NOVO);
            }
            if (alunosRigistrados != 1) {
                listaAlunos.add(aluno);
                alunosRigistrados++;
            }
            aluno.getPeriodoDia().setQuantidadDeAlunos(limiteUltimoFila);
        } else {
            System.out.println("Impossível registrar " + aluno.getNome() + " no período: " + aluno.getPeriodoDia().name() + ", pois não existe mais vagas!");
            semMatricula++;
        }
    }

    @Override
    public String toString() {
        return " " + listaAlunos;
    }
}

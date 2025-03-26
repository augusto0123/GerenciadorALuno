package classe;

import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Classe {

    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

}

package classe;

import model.Aluno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Classe {

    // 1° Criar lista
    private List<Aluno> alunos = new ArrayList<>();

    // 2° Funcao para adicionar aluno
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    // 3° Funcao para buscar aluno por atributo
    public List<Aluno> buscarAlunoPorNome(String nome){
        return alunos.stream()
                .filter(aluno -> aluno.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
    }

    // 4 Funcao para ordenar alunos por nota
    public List<Aluno> listarAlunosPorNotaCrescente(){
        return alunos.stream()
                .sorted(Comparator.comparingInt(Aluno::getNota))
                .collect(Collectors.toList());
    }

}

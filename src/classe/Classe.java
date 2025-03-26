package classe;

import model.Aluno;

import java.util.*;
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

    // 5 Funcao para exibir a contagem de alunos por curso
    public Map<String, Integer> contagemAlunosPorDiscipplina(){
        Map<String, Integer> contagem = new HashMap<>();

        for (Aluno aluno : alunos){
            contagem.put(aluno.getDisciplina(), contagem.getOrDefault(aluno.getDisciplina(),0)+1);
        }
        return contagem;

    }

}

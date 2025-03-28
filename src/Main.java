import classe.Classe;
import model.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Classe classe = new Classe();

        Aluno aluno1 = new Aluno("Augusto", 75, "Artes");
        Aluno aluno2 = new Aluno("Lívia", 100, "Artes");
        Aluno aluno3 = new Aluno("Maria", 85, "Matemática");
        Aluno aluno4 = new Aluno("José", 90, "Português");

        // adicionando alunos na lista
        classe.adicionarAluno(aluno1);
        classe.adicionarAluno(aluno2);
        classe.adicionarAluno(aluno3);
        classe.adicionarAluno(aluno4);

        // buscando alunos por nome
        System.out.println("Forneça o nome do aluno: ");
        String nomeFornecido = scanner.nextLine();

        classe.buscarAlunoPorNome(nomeFornecido)
                .forEach(aluno -> System.out.println("Nota: " + aluno.getNota() + " | Disciplina: " + aluno.getDisciplina()));

        // Listando alunos com base na nota em ordem crescente
        classe.listarAlunosPorNotaCrescente()
                .forEach(aluno -> System.out.println("Nome: " + aluno.getNome() + " | Nota: " + aluno.getNota()));

        // Listando contagem de alunos por disciplina
        classe.contagemAlunosPorDiscipplina()
                .forEach((disciplina, quantidade) -> System.out.println("Disciplina: " + disciplina + " | N° de alunos: " + quantidade));

        // Listar alunos unicos
        classe.exibirAlunosUnicos()
                .forEach(aluno -> System.out.println(aluno.getNome()));

        // Exibir alunos Com nota menor que a fornecida
        int notaFornecida = scanner.nextInt();

        classe.alunosComMenorNota(notaFornecida)
                .forEach(aluno -> System.out.println(aluno.getNome()));


    }
}
import classe.Classe;
import model.Aluno;

public class Main {
    public static void main(String[] args) {

        Classe classe = new Classe();
        Aluno aluno1 = new Aluno("Augusto", 75, "Artes");
        Aluno aluno2 = new Aluno("Lívia", 100, "Artes");
        Aluno aluno3 = new Aluno("Maria", 85, "Matemática");
        Aluno aluno4 = new Aluno("José", 90, "Português");

        classe.adicionarAluno(aluno1);
        classe.adicionarAluno(aluno2);
        classe.adicionarAluno(aluno3);
        classe.adicionarAluno(aluno4);
    }
}
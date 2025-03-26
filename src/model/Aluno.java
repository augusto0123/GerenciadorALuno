package model;

public class Aluno {

    private String nome;
    private int nota;
    private String disciplina;

    public Aluno(String nome, int nota, String disciplina) {
        this.nome = nome;
        this.nota = nota;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

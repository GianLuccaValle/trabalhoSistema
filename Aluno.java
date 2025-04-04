import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private List<Disciplina> disciplinas;
    private Curso curso;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    public void matricular(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }

    @Override
    public String toString() {
        return nome + " (" + matricula + ") - Curso: " + (curso != null ? curso.getNomeCurso() : "Nenhum");
    }
}
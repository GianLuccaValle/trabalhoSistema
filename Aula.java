import java.util.ArrayList;
import java.util.List;

public class Aula {
    private Disciplina disciplina;
    private Professor professor;
    private List<Frequencia> frequencias;

    public Aula(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.frequencias = new ArrayList<>();
    }

    public void registrarFrequencia(Aluno aluno, boolean presente) {
        frequencias.add(new Frequencia(aluno, presente));
    }

    // Getters
    public Professor getProfessor() { return professor; }
}
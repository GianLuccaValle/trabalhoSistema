import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {
    private String nome;
    private List<Professor> professores;
    private List<Aula> aulas;
    private Map<Aluno, Double> notas;
    private Map<Aluno, Integer> faltas;

    public Disciplina(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>(4);
        this.aulas = new ArrayList<>();
        this.notas = new HashMap<>();
        this.faltas = new HashMap<>();
    }

    public void adicionarProfessor(Professor professor) {
        if (professores.size() < 4) {
            professores.add(professor);
        }
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
    }

    public void registrarNota(Aluno aluno, double nota) {
        notas.put(aluno, nota);
    }

    public void registrarFalta(Aluno aluno) {
        faltas.put(aluno, faltas.getOrDefault(aluno, 0) + 1);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public List<Professor> getProfessores() { return professores; }
    public List<Aula> getAulas() { return aulas; }

    @Override
    public String toString() {
        return nome + " (Professores: " + professores + ")";
    }
}
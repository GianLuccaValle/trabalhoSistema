import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private List<Fase> fases;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.fases = new ArrayList<>();
    }

    public void adicionarFase(Fase fase) {
        fases.add(fase);
    }

    // Getters e Setters
    public String getNomeCurso() { return nomeCurso; }
    public List<Fase> getFases() { return fases; }
    public void setFases(List<Fase> fases) { this.fases = fases; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nomeCurso).append("\n");
        for (Fase fase : fases) {
            sb.append(fase.toString()).append("\n");
        }
        return sb.toString();
    }
}
import java.util.ArrayList;
import java.util.List;

public class Fase {
    private int numero;
    private List<Disciplina> disciplinas;

    public Fase(int numero) {
        this.numero = numero;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    // Getters e Setters
    public int getNumero() { return numero; }
    public List<Disciplina> getDisciplinas() { return disciplinas; }

    @Override
    public String toString() {
        return "Fase " + numero + " - Disciplinas: " + disciplinas;
    }
}
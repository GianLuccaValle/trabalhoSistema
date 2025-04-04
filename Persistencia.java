public interface Persistencia {
    void salvarDados(Curso curso);
    Curso carregarDados();
}
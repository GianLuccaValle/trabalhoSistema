import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONPersistencia implements Persistencia {
    private final ObjectMapper mapper = new ObjectMapper();

    public void salvar(Curso curso) {
        try {
            mapper.writeValue(new File("dados.json"), curso);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Curso carregar() {
        try {
            return mapper.readValue(new File("dados.json"), Curso.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
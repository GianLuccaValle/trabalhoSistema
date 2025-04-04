import jakarta.xml.bind.*;
import java.io.File;

public class XMLPersistencia implements Persistencia {
    private final String ARQUIVO = "dados.xml";

    @Override
    public void salvarDados(Curso curso) {
        try {
            JAXBContext context = JAXBContext.newInstance(Curso.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(curso, new File(ARQUIVO));
            System.out.println("Dados salvos em XML!");
        } catch (Exception e) {
            System.err.println("Erro ao salvar XML: " + e.getMessage());
        }
    }

    @Override
    public Curso carregarDados() {
        try {
            JAXBContext context = JAXBContext.newInstance(Curso.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Curso) unmarshaller.unmarshal(new File(ARQUIVO));
        } catch (Exception e) {
            System.err.println("Erro ao carregar XML: " + e.getMessage());
            return null;
        }
    }
}
import java.util.Scanner;

public class CursoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sistema Acadêmico");
        System.out.println("Escolha a persistência:");
        System.out.println("1 - XML");
        System.out.println("2 - JSON");
        System.out.println("3 - MySQL");
        int opcao = scanner.nextInt();
        
        Persistencia persistencia = switch(opcao) {
            case 1 -> new XMLPersistencia();
            case 2 -> new JSONPersistencia();
            case 3 -> new MySQLPersistencia();
            default -> throw new IllegalArgumentException("Opção inválida");
        };
        
        testarCRUD(persistencia);
    }
    

    private static void testarCRUD(Persistencia persistencia) {
        // Create
        Curso curso = criarCursoExemplo();
        persistencia.salvarDados(curso);
        
        // Read
        Curso cursoCarregado = persistencia.carregarDados();
        System.out.println("Curso carregado:\n" + cursoCarregado);
        
        // Update
        cursoCarregado.getFases().get(0).getDisciplinas().add(new Disciplina("Banco de Dados"));
        persistencia.salvarDados(cursoCarregado);
        
        // Delete
        cursoCarregado.getFases().remove(1);
        persistencia.salvarDados(cursoCarregado);
    }

    private static Curso criarCursoExemplo() {
        Curso curso = new Curso("Ciência da Computação");
        Fase fase1 = new Fase(1);
        fase1.getDisciplinas().add(new Disciplina("Programação I"));
        curso.adicionarFase(fase1);
        return curso;
    }
    
}
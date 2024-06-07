import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {
        // Cadastro de materiais
        Livro livro1 = new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien");
        Revista revista1 = new Revista(2, "Revista em quadrinhos monica");
        DVD dvd1 = new DVD(3, "Matrix", 136);

        // Cadastro de usuários
        Usuario usuario1 = new Usuario(1, "Lucas");
        Usuario usuario2 = new Usuario(2, "Amanda");

        // Listar materiais cadastrados
        List<Material> materiais = List.of(livro1, revista1, dvd1);
        System.out.println("Materiais cadastrados:");
        for (Material material : materiais) {
            System.out.println(material);
        }

        // Realizar empréstimos
        usuario1.realizarEmprestimo(livro1);
        usuario1.realizarEmprestimo(dvd1);
        usuario2.realizarEmprestimo(revista1);

        // Listar materiais após empréstimos
        System.out.println("\nMateriais após empréstimos:");
        for (Material material : materiais) {
            System.out.println(material);
        }

        // Listar usuários e seus empréstimos ativos
        List<Usuario> usuarios = List.of(usuario1, usuario2);
        System.out.println("\nUsuários e seus empréstimos ativos:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        // Devoluções
        usuario1.devolverMaterial(livro1);
        usuario2.devolverMaterial(revista1);

        // Listar materiais após devoluções
        System.out.println("\nMateriais após devoluções:");
        for (Material material : materiais) {
            System.out.println(material);
        }

        // Listar usuários e seus empréstimos ativos após devoluções
        System.out.println("\nUsuários e seus empréstimos ativos após devoluções:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
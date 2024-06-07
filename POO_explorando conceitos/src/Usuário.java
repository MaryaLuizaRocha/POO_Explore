import java.util.ArrayList;
import java.util.List;

class Usuario {
    private int id;
    private String nome;
    private List<Material> emprestimosAtivos;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.emprestimosAtivos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Material> getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public void realizarEmprestimo(Material material) {
        if (material.isDisponivel()) {
            material.setDisponivel(false);
            emprestimosAtivos.add(material);
        } else {
            System.out.println("O material '" + material.getTitulo() + "' não está disponível para empréstimo.");
        }
    }

    public void devolverMaterial(Material material) {
        if (emprestimosAtivos.contains(material)) {
            material.setDisponivel(true);
            emprestimosAtivos.remove(material);
        } else {
            System.out.println("O material '" + material.getTitulo() + "' não está emprestado para este usuário.");
        }
    }

    @Override
    public String toString() {
        StringBuilder emprestimos = new StringBuilder();
        for (Material material : emprestimosAtivos) {
            emprestimos.append(material.getTitulo()).append(", ");
        }
        return "ID: " + id + ", Nome: " + nome + ", Empréstimos Ativos: " + (emprestimos.length() > 0 ? emprestimos.substring(0, emprestimos.length() - 2) : "Nenhum");
    }
}
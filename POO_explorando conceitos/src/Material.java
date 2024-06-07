import java.util.ArrayList;
import java.util.List;

class Material {
    private static int totalMateriais = 0;
    protected int id;
    protected String titulo;
    protected boolean disponivel;

    public Material(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponivel = true;
        totalMateriais++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public static int getTotalMateriais() {
        return totalMateriais;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Disponível: " + disponivel;
    }
}
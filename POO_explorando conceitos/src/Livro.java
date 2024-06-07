class Livro extends Material {
    private String autor;

    public Livro(int id, String titulo, String autor) {
        super(id, titulo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Disponível: " + disponivel;
    }
}

class Revista extends Material {
    public Revista(int id, String titulo) {
        super(id, titulo);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Disponível: " + disponivel;
    }
}

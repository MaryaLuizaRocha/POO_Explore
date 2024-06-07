class DVD extends Material {
    private int duracao;

    public DVD(int id, String titulo, int duracao) {
        super(id, titulo);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Duração: " + duracao + " minutos, Disponível: " + disponivel;
    }
}

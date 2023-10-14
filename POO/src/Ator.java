public class Ator extends Pessoa {

    private String projetoAtual;
    private int projetosTotais;

    @Override
    public void trabalhar() {
        System.out.println("Atuar em peças teatrais");
    }

    @Override
    public void estudar() {
        System.out.println("Faculdade de Artes Cênicas");
    }

    // Getters and Setters
    public String getProjetoAtual() {
        return projetoAtual;
    }

    public void setProjetoAtual(String projetoAtual) {
        this.projetoAtual = projetoAtual;
    }

    public int getProjetosTotais() {
        return projetosTotais;
    }

    public void setProjetosTotais(int projetosTotais) {
        this.projetosTotais = projetosTotais;
    }

    public void atuar() {
        System.out.println("Atuando");
    }
}
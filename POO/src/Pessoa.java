public abstract class Pessoa {

    private String nome;
    private int idade;
    private double salario;
    private String especialidade;
    private String localDeTrabalho;
    private String tiposDeClientes;

    // Métodos
    public void trabalhar() {
        System.out.println("Trabalho qualquer");
    }

    public void estudar() {
        System.out.println("Escola regular");
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public String getTiposDeClientes() {
        return tiposDeClientes;
    }

    public void setTiposDeClientes(String tiposDeClientes) {
        this.tiposDeClientes = tiposDeClientes;
    }

}

public class Medico extends Pessoa {

    private String pacientesMensais;

    @Override
    public void trabalhar() {
        System.out.println("Fazendo cirurgias");
    }

    @Override
    public void estudar() {
        System.out.println("Faculdade de Medicina");
    }

    public String getPacientesMensais() {
        return pacientesMensais;
    }

    public void setPacientesMensais(String pacientesMensais) {
        this.pacientesMensais = pacientesMensais;
    }

}

package classes;

public class Consulta {
    private Animal animal;
    private Veterinario veterinario;
    private int codConsulta;
    private String dtConsulta, horaConsulta, diagnostico;
    private double valorConsulta;
    
    // -------------- Métodos Construtores -------------- //
    public Consulta (int codConsulta, Animal animal, Veterinario veterinario, String dtConsulta, String horaConsulta,
            String diagnostico, double vlConsulta) {
        
        this.animal = animal;
        this.veterinario = veterinario;
        this.codConsulta = codConsulta;
        this.horaConsulta = horaConsulta;
        this.dtConsulta = dtConsulta;
        this.diagnostico = diagnostico;
        this.valorConsulta = vlConsulta;
    }
    
    // -------------- Getters e Setters -------------- //
    public Animal getAnimal() {
        return animal;
    }
    
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public int getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.codConsulta = codConsulta;
    }

    public String getDtConsulta() {
        return dtConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
    
    public void setDtConsulta(String dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
 
    @Override
    public String toString() {
        return "Consulta{" + "animal=" + animal + 
                ", veterinario=" + veterinario + 
                ", cod=" + codConsulta + 
                ", Data=" + dtConsulta + 
                ", Hora=" + horaConsulta +
                ", Diagnostico=" + diagnostico + 
                ", Valor=" + valorConsulta + 
                '}';
    }
    
    
}

package classes;

public class Consulta {
    private Animal animal;
    private Veterinario veterinario;
    private int codConsulta;
    private String dtConsulta, horaConsulta, diagnostico;
    private double vlConsulta;
    
    // -------------- Métodos Construtores -------------- //
    public Consulta (int codConsulta, Animal animal, Veterinario veterinario, String dtConsulta, String horaConsulta,
            String diagnostico, double vlConsulta) {
        
        this.animal = animal;
        this.veterinario = veterinario;
        this.codConsulta = codConsulta;
        this.dtConsulta = dtConsulta;
        this.diagnostico = diagnostico;
        this.vlConsulta = vlConsulta;
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

    public void setDtConsulta(String dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public double getVlConsulta() {
        return vlConsulta;
    }

    public void setVlConsulta(double vlConsulta) {
        this.vlConsulta = vlConsulta;
    }

    @Override
    public String toString() {
        return "Consulta{" + "animal=" + animal + 
                ", veterinario=" + veterinario + 
                ", cod=" + codConsulta + 
                ", Data=" + dtConsulta + 
                ", Diagnostico=" + diagnostico + 
                ", Valor=" + vlConsulta + 
                '}';
    }
    
    
}

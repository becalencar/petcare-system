public class Animal {
    private String especie, raca, sexo, observacoes;
    private int idAnimal;
    private double peso;
    private Tutor dono; // um animal só pode ter um tutor

    //Construtores
    //---------------------------------------------------------------//

    public Animal(String especie, String sexo, Tutor dono, int idAnimal) {
        this.especie = especie;
        this.sexo = sexo;
        this.dono = dono;
        this.idAnimal = idAnimal;
    }
    
    
    
    //Getters and Setters
    //---------------------------------------------------------------//
    public String getEspecie() {
        return this.especie;
    }

    public String getRaca() {
        return this.raca;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public int getIdAnimal() {
        return this.idAnimal;
    }

    public double getPeso() {
        return this.peso;
    }

    public Tutor getDono(){
        return this.dono;
    }
    
    public String getNomeDono() {
        String nomeTutor = dono.getNome();
        return nomeTutor;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDono(Tutor dono) {
        this.dono = dono;
    }
    
    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", especie=" + especie +
                ", raca=" + raca +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", tutor=" + dono +
                ", observacoes=" + observacoes +
                '}';
    }
    
}

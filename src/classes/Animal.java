package classes;

public class Animal {
    private int idAnimal;
    private String nome, especie, raca, sexo, dtNascimento;
    private double peso;
    private Tutor dono; // agregação

    //Construtores
    //---------------------------------------------------------------//

    public Animal(int idAnimal, String nome, String especie, String raca, String sexo, String dtNascimento, double peso, Tutor dono) {
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
        this.peso = peso;
        this.dono = dono;
    }
    
    
    
    //Getters and Setters
    //---------------------------------------------------------------//
    public String getNome() {
        return this.nome;
    }
    
    public String getEspecie() {
        return this.especie;
    }

    public String getRaca() {
        return this.raca;
    }

    public String getSexo() {
        return this.sexo;
    }
    
    public String getDtNascimento() {
        return this.dtNascimento;
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
    
    /*public String getNomeDono() {
        String nomeTutor = dono.getNome();
        return nomeTutor;
    }*/

    public void setNome(String nome) {
        this.nome = nome;
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
    
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDono(Tutor dono) {
        this.dono = dono;
    }
    
    // não tem set de idAnimal porque ele é inicializado automaticamente no formulário
    
    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", nome=" + nome +
                ", especie=" + especie +
                ", raca=" + raca +
                ", sexo=" + sexo +
                ", dtNascimento=" + dtNascimento +
                ", peso=" + peso +
                ", tutor=" + dono +
                '}';
    } 
}

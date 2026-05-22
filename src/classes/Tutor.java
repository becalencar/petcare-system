package classes;


import java.util.ArrayList;

public class Tutor {
    private String nome;
    private int idTutor; //identificador automático que vai ser gerado pelo forms
    private String telefone;
    private ArrayList<Animal> listaAnimais = new ArrayList(); // um tutor pode ter vários animais
    
    
    //Construtores
    //---------------------------------------------------------------//

    public Tutor(String nome, int idTutor, String telefone) {
        this.nome = nome;
        this.idTutor = idTutor;
        this.telefone = telefone;
    }
    public Tutor(String nome, int idTutor, String telefone, ArrayList<Animal> listaAnimais) {
        this.nome = nome;
        this.idTutor = idTutor;
        this.telefone = telefone;
        
        for(Animal a : listaAnimais){
            adicionarAnimal(a);
        }
    }
    
    public Tutor(String nome, int idTutor) {
        this.nome = nome;
        this.idTutor = idTutor;
    }
    
    //Metodos
    //---------------------------------------------------------------//
    
    //não sei porque, mas essa função tem que existir pra nao dar "Overridable method in constructor" :)
    private void adicionarAnimal(Animal pet) {
        listaAnimais.add(pet);
    }
      
    
    //Getters and Setters
    //---------------------------------------------------------------//
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdTutor() {
        return idTutor;
    }
    
    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setAnimal(Animal a){
        this.adicionarAnimal(a);
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }
    
    public ArrayList<String> getIdAnimais(){
        ArrayList<String> listaIdAnimais = new ArrayList();
        for(Animal pet : listaAnimais){
            listaIdAnimais.add(String.valueOf(pet.getIdAnimal()));
        }
        return listaIdAnimais;
    }
    
    @Override
    public String toString() {
        return "Tutor{" +
                "idTutor=" + idTutor +
                ", nome=" + nome +
                ", telefone=" + telefone +
                ", idAnimais=" + getIdAnimais() +
                '}';
    }
 
}

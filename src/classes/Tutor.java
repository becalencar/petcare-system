package classes;


import java.util.ArrayList;

public class Tutor {
    private String nome;
    private int idTutor; //identificador automático que vai ser gerado pelo forms
    private String telefone;
    private final ArrayList<Integer> idAnimal = new ArrayList(); // um tutor pode ter vários animais
    
    
    //Construtores
    //---------------------------------------------------------------//

    public Tutor(String nome, int idTutor, String telefone) {
        this.nome = nome;
        this.idTutor = idTutor;
        this.telefone = telefone;
    }
    
    //Metodos
    //---------------------------------------------------------------//
    public void adicionarAnimal(int idAnimal) {
        this.idAnimal.add(idAnimal);
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
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Integer> getIdAnimal() {
        return idAnimal;
    }
    
    @Override
    public String toString() {
        return "Tutor{" +
                "idTutor=" + idTutor +
                ", nome=" + nome +
                ", telefone=" + telefone +
                ", idAnimais=" + idAnimal +
                '}';
    }
 
}

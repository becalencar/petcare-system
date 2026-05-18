public class Tutor {
    private String nome;
    private int idTutor; //identificador automático que vai ser gerado pelo forms
    private int telefone;
    
    
    //Construtores
    //---------------------------------------------------------------//

    public Tutor(String nome, int telefone, int idTutor) {
        this.nome = nome;
        this.idTutor = idTutor;
        this.telefone = telefone;
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

    public int getTelefone() {
        return telefone;
    }
    
    
    
}

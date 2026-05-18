public class Veterinario extends Funcionario {
    private int numCRMV;
    private String especialidade;

    
    //Metodos construtores
    //---------------------------------------------------------------//
    public Veterinario(String nomeFuncionario) {
        super(nomeFuncionario);
    }

    
   
    //Getters and Setters
    //---------------------------------------------------------------//
    public int getNumCRMV() {
        return numCRMV;
    }

    public void setNumCRMV(int numCRMV) {
        this.numCRMV = numCRMV;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}

package classes;
import java.util.ArrayList;

public class Veterinario extends Funcionario {
    private String especialidade, numCRMV;

    
    // -------------- Métodos Construtores -------------- //
    public Veterinario(int codFuncionario, String nomeFuncionario, ArrayList<String> telefones, String numCRMV, String especialidade) {
        super(codFuncionario, nomeFuncionario, telefones);
        this.numCRMV = numCRMV;
        this.especialidade = especialidade;
    }
    
    public Veterinario(int codFuncionario, String nomeFuncionario, String numCRMV, String especialidade) {
        super(codFuncionario, nomeFuncionario);
        this.numCRMV = numCRMV;
        this.especialidade = especialidade;
    }   
  
    // -------------- Getters e Setters -------------- //
    public String getNumCRMV() {
        return numCRMV;
    }
    
    public void setNumCRMV(String numCRMV) {
        this.numCRMV = numCRMV;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                ", numCRMV=" + numCRMV +
                ", especialidade=" + especialidade + '}';
    }
    
}

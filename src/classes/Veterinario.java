package classes;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Veterinario extends Funcionario {
    private String especialidade, numCRMV;

    
    //Metodos construtores
    //---------------------------------------------------------------//
    
    public Veterinario(int codFuncionario, String nomeFuncionario, ArrayList<String> telefones, String numCRMV, String especialidade) {
        super(codFuncionario, nomeFuncionario, telefones);
        setNumCRMV(numCRMV);
        this.especialidade = especialidade;
    }
    
    public Veterinario(int codFuncionario, String nomeFuncionario, String numCRMV, String especialidade) {
        super(codFuncionario, nomeFuncionario);
        setNumCRMV(numCRMV);
        this.especialidade = especialidade;
    }
    
    
   
    //Getters and Setters
    //---------------------------------------------------------------//
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

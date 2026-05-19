
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Veterinario extends Funcionario {
    private int numCRMV;
    private String especialidade;

    
    //Metodos construtores
    //---------------------------------------------------------------//
    
    public Veterinario(int codFuncionario, String nomeFuncionario, ArrayList<Integer> telefones, int numCRMV, String especialidade) {
        super(codFuncionario, nomeFuncionario, telefones);
        setNumCRMV(numCRMV);
        this.especialidade = especialidade;
    }
    
    public Veterinario(int codFuncionario, String nomeFuncionario, int numCRMV, String especialidade) {
        super(codFuncionario, nomeFuncionario);
        setNumCRMV(numCRMV);
        this.especialidade = especialidade;
    }
    
   
    //Getters and Setters
    //---------------------------------------------------------------//
    public int getNumCRMV() {
        return numCRMV;
    }

    public void setNumCRMV(int numCRMV) {
        
        while (true) {
            
            // CRMV tem de 4 a 6 dígitos
            if (numCRMV > 0 && Integer.toString(numCRMV).length() >= 4 && Integer.toString(numCRMV).length() <= 6) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Digite um CRMV válido.");
            }
            
        }
        
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
                "numCRMV=" + numCRMV +
                "especialidade=" + especialidade + '}';
    }
    
}

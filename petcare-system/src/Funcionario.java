
import java.util.ArrayList;

public class Funcionario {
    private int codFuncionario; 
    private String nomeFuncionario;
    private ArrayList<Integer> telefones = new ArrayList();

    //Metodos
    //---------------------------------------------------------------//
    // teste de commit
    private boolean telefoneValido(int num){ 
        String numero = Integer.toString(num); // converte o número pra string
        
        if(numero.length() != 11){ //confere se o numero de entrada é um telefone (11 dígitos)
            return false;
        } else{
            return true;
        }
    }
    
    public void adicionarTelefone(int num){
        if(telefoneValido(num) != true){
            telefones.add(num);
        }
    }
    
    
    
    //Getters and Setters: 
    
    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
    
    
    
    
}


import java.util.ArrayList;

public class Funcionario {
    private int codFuncionario; 
    private String nomeFuncionario;
    private ArrayList<Integer> telefones = new ArrayList();

    //Metodos construtores

    public Funcionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
    
    //Metodos
    //---------------------------------------------------------------//
    private boolean telefoneValido(int num){ 
        String numero = Integer.toString(num); // converte o número pra string
        
        return (numero.length() == 11); //retorna True caso o telefone seja válido (11 dígitos)
    }
    
    public void adicionarTelefone(int num){
        if(telefoneValido(num)){
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

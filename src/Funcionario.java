
import java.util.ArrayList;

public class Funcionario {
    private int codFuncionario; 
    private String nomeFuncionario;
    private final ArrayList<Integer> telefones = new ArrayList();

    //Metodos construtores
    public Funcionario(int codFuncionario, String nomeFuncionario, ArrayList<Integer> telefones) {
        this.nomeFuncionario = nomeFuncionario;
        this.codFuncionario = codFuncionario;
        
        for(int tel : telefones) {  // percorre a lista de telefones para que o método valide cada um
            adicionarTelefone(tel);
        }
    }
    
    public Funcionario(int codFuncionario, String nomeFuncionario) {
        this.codFuncionario = codFuncionario;
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
    //---------------------------------------------------------------//
    public int getCodFuncionario() {
        return codFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo=" + codFuncionario +
                ", nomeFuncionario=" + nomeFuncionario +
                ", telefones=" + telefones;
    }  
}

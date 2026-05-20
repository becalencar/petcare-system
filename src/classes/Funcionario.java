package classes;


import java.util.ArrayList;

public class Funcionario {
    private int codFuncionario; 
    private String nomeFuncionario;
    private final ArrayList<String> telefones = new ArrayList();

    //Metodos construtores
    //---------------------------------------------------------------//
    public Funcionario(int codFuncionario, String nomeFuncionario, ArrayList<String> telefones) {
        this.nomeFuncionario = nomeFuncionario;
        this.codFuncionario = codFuncionario;
        
        for(String tel : telefones) {  // percorre a lista de telefones para que o método valide cada um
            adicionarTelefone(tel);
        }
    }
    
    public Funcionario(int codFuncionario, String nomeFuncionario) {
        this.codFuncionario = codFuncionario;
        this.nomeFuncionario = nomeFuncionario;
    }
    
    
    //Metodos
    //---------------------------------------------------------------//
    public boolean telefoneValido(String num){ 
        return (num.length() == 11); //retorna True caso o telefone seja válido (11 dígitos)
    }
    
    public void adicionarTelefone(String num){
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
    
    public ArrayList<String> getTelefones() {
        return telefones;
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

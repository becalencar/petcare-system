package classes;


import java.util.ArrayList;

public class Recepcionista extends Funcionario {
    
    //Metodos construtores
    
    public Recepcionista(int codFuncionario, String nomeFuncionario, ArrayList<String> telefones) {
        super(codFuncionario, nomeFuncionario, telefones);
    }
    
    @Override
    public String toString() {
        return super.toString() + '}';
    }
    
}

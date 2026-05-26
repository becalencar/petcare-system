package interfaces;

// a interface contém somente o método, o corpo é construído na classe

import classes.Categoria;
import classes.Funcionario;

public interface GerenciarProntuario {

    public void inserirProcedimento(int codProcedimento, String nome, String data, double custo, Funcionario profissional, Categoria categoria); // sem relato
    public void inserirProcedimento(int codProcedimento, String nome, String data, double custo, Funcionario profissional, Categoria categoria, String relato); // com relato
    public String retornarTodosProcedimentos();
    public String retornarProntuarioCompleto();
    public double calcularCustoTotal();
    public int quantidadeDeProcedimentos();
    
}

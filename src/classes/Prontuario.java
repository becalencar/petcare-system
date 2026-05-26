package classes;

import interfaces.GerenciarProntuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Prontuario implements GerenciarProntuario {
    private int codProntuario;
    private Animal animal;
    private final ArrayList<Procedimento> listaProcedimentos = new ArrayList();

    public Prontuario(int codProntuario, Animal animal) {
        this.codProntuario = codProntuario;
        this.animal = animal;
    }

    public int getCodProntuario() {
        return codProntuario;
    }

    public void setCodProntuario(int codProntuario) {
        if (codProntuario <= 0) {
            JOptionPane.showMessageDialog(null, "Código inválido!");
            return;
        }
        
        this.codProntuario = codProntuario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public ArrayList<Procedimento> getListaProcedimentos() {
        return listaProcedimentos;
    }    
    
    @Override
    public void inserirProcedimento(int codProcedimento, String nome, String data, double custo, Funcionario profissional, Categoria categoria) {    // sem relato
        Procedimento p = new Procedimento(codProcedimento, nome, data, custo, profissional, categoria);  // cria o objeto Procedimento
        listaProcedimentos.add(p);
    }

    @Override
    public void inserirProcedimento(int codProcedimento, String nome, String data, double custo, Funcionario profissional, Categoria categoria, String relato) { // com relato
        Procedimento p = new Procedimento(codProcedimento, nome, data, relato, custo, profissional, categoria);
        listaProcedimentos.add(p);
    }
    
    @Override
    public String retornarTodosProcedimentos() {
        String retorno = "Todos os Procedimentos:";
        
        for (Procedimento p : listaProcedimentos) {
            retorno = retorno + '\n' + 
                    "Código: " + p.getCodProcedimento() + '\n' +
                    "Nome: " + p.getNomeProcedimento() + '\n' +
                    "Profissional: " + p.getProfissional().getNomeFuncionario() + '\n' +
                    "Categoria: " + p.getCategoria().getNomeCategoria() + '\n' + 
                    "Data: " + p.getData() + "\n\n";
        }
        
        return retorno;
    }
    
    @Override
    public String retornarProntuarioCompleto() {
        return "Id Animal: " + animal.getIdAnimal() + '\n' +
                "Nome Animal: " + animal.getNome() + '\n' + 
                "Espécie: " + animal.getEspecie() + '\n' +
                retornarTodosProcedimentos();
    }
    
    @Override
    public double calcularCustoTotal() {
        double vlTotal = 0;
        
        for (Procedimento p : listaProcedimentos) {
            vlTotal = vlTotal + p.getCusto();
        }
        
        return vlTotal;
    }
    
    @Override
    public int quantidadeDeProcedimentos() {
        return listaProcedimentos.size()+1; // o índice na lista começa do 0, mas ninguém começa a contar nada do 0
    }
}

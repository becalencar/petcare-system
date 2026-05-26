package classes;

import javax.swing.JOptionPane;

public class Procedimento {
    private int codProcedimento;
    private String nomeProcedimento, data, relato;
    private double custo;
    private Funcionario profissional;
    private Categoria categoria;

    public Procedimento(int codProcedimento, String nomeProcedimento, String data, double custo, Funcionario profissional, Categoria categoria, String relato) {
        setCodProcedimento(codProcedimento);
        setNomeProcedimento(nomeProcedimento);
        this.data = data;        
        setCusto(custo);
        this.profissional = profissional;
        this.categoria = categoria;
        setRelato(relato);
    }
    
    public int getCodProcedimento () {
        return codProcedimento;
    }
    
    public void setCodProcedimento(int codProcedimento) {
        if (codProcedimento <= 0) {
            JOptionPane.showMessageDialog(null, "Código Inválido!");
            return;
        }
        
        this.codProcedimento = codProcedimento;
    }

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcedimento) {
        if (nomeProcedimento.isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira um nome!");
            return;
        }
        
        this.nomeProcedimento = nomeProcedimento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRelato() {
        return relato;
    }

    public void setRelato(String relato) {
        if (relato.isBlank() || relato == null) {
            this.relato = "[SEM RELATO]";
            return;
        }
        
        this.relato = relato;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {      
        if (custo <= 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
            return;
        }
        
        this.custo = custo;
    }

    public Funcionario getProfissional() {
        return profissional;
    }

    public void setProfissional(Funcionario profissional) {
        this.profissional = profissional;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Procedimento{" + 
                "nome=" + nomeProcedimento + 
                ", data=" + data + 
                ", relato=" + relato + 
                ", custo=" + custo + 
                ", profissional=" + profissional + 
                ", categoria=" + categoria + 
                '}';
    }
    
    
}

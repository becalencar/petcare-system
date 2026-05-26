package classes;

import javax.swing.JOptionPane;

public class Categoria {
    private int codCategoria;
    private String nomeCategoria;
    
    public Categoria(int codCategoria, String nomeCategoria) {
        this.codCategoria = codCategoria;
        this.nomeCategoria = nomeCategoria;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        if (codCategoria <= 0) {
            JOptionPane.showMessageDialog(null, "Código inválido!");
            return;
        }
        
        this.codCategoria = codCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    
    @Override
    public String toString() {
        return "Categoria{" +
                "codCategoria: " + codCategoria +
                ", nomeCategoria: " + nomeCategoria +
                '}';
    }
}

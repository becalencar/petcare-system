package telas;

import classes.*;
import java.util.ArrayList;


public class FormCategoria extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormCategoria.class.getName());
    ArrayList<Categoria> listaCategorias;
    FormPrincipal principal;
    
    public FormCategoria(java.awt.Frame parent, boolean modal, ArrayList<Categoria> listaCategorias) {
        super(parent, modal);
        this.listaCategorias = listaCategorias;
        principal = (FormPrincipal) this.getParent();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        btnCadastrarCategoria = new javax.swing.JButton();
        btnExcluirCategoria = new javax.swing.JButton();
        btnListarCategorias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane2.setViewportView(taSaida);

        btnCadastrarCategoria.setText("Inserir Nova categoria");
        btnCadastrarCategoria.addActionListener(this::btnCadastrarCategoriaActionPerformed);

        btnExcluirCategoria.setText("Excluir categoria");
        btnExcluirCategoria.addActionListener(this::btnExcluirCategoriaActionPerformed);

        btnListarCategorias.setText("Listar Categorias");
        btnListarCategorias.addActionListener(this::btnListarCategoriasActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(btnListarCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarCategorias)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCategoriasActionPerformed
        taSaida.setText("");
        for (Categoria c : listaCategorias){
            taSaida.append(c + "\n");
        }
    }//GEN-LAST:event_btnListarCategoriasActionPerformed

    private void btnCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCategoriaActionPerformed
        int codCategoria = listaCategorias.size() + 1;
        
        String nome = principal.validarEntradaTexto("Insira o nome da caetgoria: ");
        if (nome == null){
            return;
        }
        
        
        listaCategorias.add(new Categoria(codCategoria, nome));
        taSaida.setText("Categoria inserida com sucesso!");
    }//GEN-LAST:event_btnCadastrarCategoriaActionPerformed

    private void btnExcluirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCategoriaActionPerformed
        Integer codigo = principal.validarEntradaInteiro("Insira o código da categoria para ser removida: "); //possui erro
        if (codigo == null) {
            return;
        }

        Categoria catAux = principal.buscarCategoriaCodigo(codigo);
        if (catAux != null){
            listaCategorias.remove(catAux);
            taSaida.setText(" ");
            taSaida.setText("Categoria removida com sucesso!");
        } else{
            taSaida.setText(" ");
            taSaida.setText("Código inválido ou Categoria inexistente!");
        }
    }//GEN-LAST:event_btnExcluirCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCategoria;
    private javax.swing.JButton btnExcluirCategoria;
    private javax.swing.JButton btnListarCategorias;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}

package telas;

import classes.*;
import java.awt.Color;
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
        getContentPane().setBackground(new Color(193, 222, 221)); //define a cor de fundo do JForm
        taSaida.setBackground(new Color(242, 245, 245)); //define a cor do fundo do taSaida
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        btnCadastrarCategoria = new javax.swing.JButton();
        btnExcluirCategoria = new javax.swing.JButton();
        btnListarCategorias = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Categorias");
        setResizable(false);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane2.setViewportView(taSaida);

        btnCadastrarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCadastrarCategoria.setText("Inserir Nova categoria");
        btnCadastrarCategoria.addActionListener(this::btnCadastrarCategoriaActionPerformed);

        btnExcluirCategoria.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExcluirCategoria.setText("Excluir categoria");
        btnExcluirCategoria.addActionListener(this::btnExcluirCategoriaActionPerformed);

        btnListarCategorias.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnListarCategorias.setText("Listar Categorias");
        btnListarCategorias.addActionListener(this::btnListarCategoriasActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/PetCare.png"))); // NOI18N

        jLabel2.setText("Gerenciar Categorias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(1024, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(btnCadastrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCategoriasActionPerformed
        taSaida.setText("");
        for (Categoria c : listaCategorias){
            taSaida.append(c + "\n");
        }
    }//GEN-LAST:event_btnListarCategoriasActionPerformed

    private void btnCadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCategoriaActionPerformed
        int codCategoria = principal.gerarIdCategoria();
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCategoria;
    private javax.swing.JButton btnExcluirCategoria;
    private javax.swing.JButton btnListarCategorias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}

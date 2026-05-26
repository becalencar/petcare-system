package telas;
import classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FormProntuario extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormProntuario.class.getName());
    ArrayList<Prontuario> listaProntuarios = new ArrayList();
    FormPrincipal principal;

    public FormProntuario(java.awt.Frame parent, boolean modal, ArrayList<Prontuario> listaProntuarios, ArrayList<Categoria> listaCategorias) {
        super(parent, modal);
        initComponents();
        this.listaProntuarios = listaProntuarios;
        principal = (FormPrincipal) this.getParent();
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertPronts = new javax.swing.JButton();
        insertPronts1 = new javax.swing.JButton();
        insertPronts2 = new javax.swing.JButton();
        insertPronts3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        insertPronts.setText("Inserir Prontuário");
        insertPronts.addActionListener(this::insertProntsActionPerformed);

        insertPronts1.setText("Editar Prontuário");
        insertPronts1.addActionListener(this::insertPronts1ActionPerformed);

        insertPronts2.setText("Imprimir Prontuário");
        insertPronts2.addActionListener(this::insertPronts2ActionPerformed);

        insertPronts3.setText("Excluir Prontuário");
        insertPronts3.addActionListener(this::insertPronts3ActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertPronts3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertPronts2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertPronts1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertPronts, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(insertPronts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertPronts1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertPronts2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertPronts3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertProntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertProntsActionPerformed
        int codigo = 6202 + (listaProntuarios.size() + 1) * 10000;
        Prontuario prontAux1 = principal.buscarProntuarioCodigo(codigo);
        
        if (prontAux1 != null) {
            codigo = codigo + 1;    // caso algum prontuário seja excluído, e depois inserirmos um novo prontuário, o código ficaria repetido
        }
        
        int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Código do animal: "));
        Prontuario prontAux2 = principal.buscarProntuarioAnimal(idAnimal);
        
        if (prontAux2 != null) {
            JOptionPane.showMessageDialog(null, "Já existe um prontuário para este animal.\nProntuário: " + prontAux2.getCodProntuario());
            return;
        }   
        
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja adicionar algum procedimento?",
                "Procedimento",
                JOptionPane.YES_NO_OPTION
        );
        
        while (true) {
            
            if (resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
                break;
            }
            
            // CONTINUAR DAQUI
        }
        
    }//GEN-LAST:event_insertProntsActionPerformed

    private void insertPronts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPronts1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPronts1ActionPerformed

    private void insertPronts2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPronts2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPronts2ActionPerformed

    private void insertPronts3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPronts3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPronts3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertPronts;
    private javax.swing.JButton insertPronts1;
    private javax.swing.JButton insertPronts2;
    private javax.swing.JButton insertPronts3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}

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
        updatePronts = new javax.swing.JButton();
        printPronts = new javax.swing.JButton();
        removePronts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        insertProceds = new javax.swing.JButton();
        printProceds = new javax.swing.JButton();
        calcCusts = new javax.swing.JButton();
        calcCusts1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        insertPronts.setText("Inserir Prontuário");
        insertPronts.addActionListener(this::insertProntsActionPerformed);

        updatePronts.setText("Editar Prontuário");
        updatePronts.addActionListener(this::updateProntsActionPerformed);

        printPronts.setText("Imprimir Prontuário");
        printPronts.addActionListener(this::printProntsActionPerformed);

        removePronts.setText("Excluir Prontuário");
        removePronts.addActionListener(this::removeProntsActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        insertProceds.setText("Inserir Procedimento");
        insertProceds.addActionListener(this::insertProcedsActionPerformed);

        printProceds.setText("Imprimir Procedimentos");
        printProceds.addActionListener(this::printProcedsActionPerformed);

        calcCusts.setText("Calcular Custo Total");
        calcCusts.addActionListener(this::calcCustsActionPerformed);

        calcCusts1.setText("Qtd. Procedimentos");
        calcCusts1.addActionListener(this::calcCusts1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printPronts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(calcCusts, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(insertPronts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(printProceds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(insertProceds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calcCusts1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(removePronts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePronts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertPronts)
                    .addComponent(insertProceds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printPronts)
                    .addComponent(printProceds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcCusts1)
                    .addComponent(calcCusts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatePronts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removePronts, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertProntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertProntsActionPerformed
        int codigo = 6202 + (listaProntuarios.size() + 1) * 10000;  // estilo de codigo de prontuario com 2026 ao contrario (pq vc ja usou assim em outro)
        Prontuario prontAux1 = principal.buscarProntuarioCodigo(codigo);    // valida o codigo PORQUE 
        
        // caso algum prontuário seja excluído, e depois inserirmos um novo prontuário, o código ficaria repetido
        if (prontAux1 != null) {    // e se tiver algum igual
            codigo = codigo + 1;    // adiciona + 1
        }
        
        int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Código do animal: "));
        Prontuario prontAux2 = principal.buscarProntuarioAnimal(idAnimal);
        
        if (prontAux2 != null) {
            JOptionPane.showMessageDialog(null, "Já existe um prontuário para este animal.\nProntuário: " + prontAux2.getCodProntuario());
            return;
        }
        
        Animal animal = principal.buscarAnimalCodigo(idAnimal);
        
        if (animal == null) {
            JOptionPane.showMessageDialog(null, "Animal inexistente! A operação será cancelada.");
            return;
        }
        
        listaProntuarios.add((new Prontuario(codigo, animal))); 
        
    }//GEN-LAST:event_insertProntsActionPerformed

    private void updateProntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProntsActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do prontuário em que deseja adicionar um procedimento:"));
        Prontuario prontAux = principal.buscarProntuarioCodigo(codigo);
        
        if (prontAux == null) {
            JOptionPane.showMessageDialog(null, "Prontuário inexistente!");
            return;
        }
        
        int codProced = prontAux.getListaProcedimentos().size() + 1;
        Procedimento procedAux = principal.buscarProcedimentoCodigo(codProced);
        
        // caso algum procedimento seja excluído, e depois inserirmos um novo procedimento, o código ficaria repetido
        if (procedAux != null) {
            codProced = codProced + 1;
        }
        
        String nomeProced = JOptionPane.showInputDialog("Nome do procedimento:");
        
        String dataProced = JOptionPane.showInputDialog("Data do procedimento:");
        String relato = JOptionPane.showInputDialog("Relato do procedimento:");
        double custoProced = Double.parseDouble(JOptionPane.showInputDialog("Custo do procedimento:"));
        procedAux.setCusto(custoProced);
        
        String funcionarios = "Selecione o funcionário do procedimento: \n"; 
        for (Funcionario f : principal.listaFuncionarios) {
            funcionarios = funcionarios + f.getCodFuncionario() + " - " + f.getNomeFuncionario();
        }
        
        int codFunc = Integer.parseInt(JOptionPane.showInputDialog(funcionarios));
    }//GEN-LAST:event_updateProntsActionPerformed

    private void printProntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printProntsActionPerformed
        taSaida.setText("");
        for (Prontuario p : listaProntuarios) {
            taSaida.append(p.getCodProntuario() + " - [Animal: " + p.getAnimal().getIdAnimal() + " - " + p.getAnimal().getNome() + "]\n");
        }
    }//GEN-LAST:event_printProntsActionPerformed

    private void removeProntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProntsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeProntsActionPerformed

    private void insertProcedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertProcedsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertProcedsActionPerformed

    private void printProcedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printProcedsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printProcedsActionPerformed

    private void calcCustsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCustsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcCustsActionPerformed

    private void calcCusts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCusts1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcCusts1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcCusts;
    private javax.swing.JButton calcCusts1;
    private javax.swing.JButton insertProceds;
    private javax.swing.JButton insertPronts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printProceds;
    private javax.swing.JButton printPronts;
    private javax.swing.JButton removePronts;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JButton updatePronts;
    // End of variables declaration//GEN-END:variables
}

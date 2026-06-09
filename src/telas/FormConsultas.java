package telas;
import java.util.ArrayList;
import classes.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FormConsultas extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormConsultas.class.getName());
    FormPrincipal principal;
    ArrayList<Consulta> listaConsultas = new ArrayList();

    public FormConsultas(java.awt.Frame parent, boolean modal, ArrayList<Consulta> listaConsultas) {
        super(parent, modal);
        initComponents();
        this.listaConsultas = listaConsultas;
        principal = (FormPrincipal) this.getParent();
        getContentPane().setBackground(new Color(193, 222, 221)); //define a cor de fundo do JForm
        taSaida.setBackground(new Color(242, 245, 245)); //define a cor do fundo do taSaida
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        insertConsults = new javax.swing.JButton();
        updateConsults = new javax.swing.JButton();
        listConsults = new javax.swing.JButton();
        removeConsults = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/PetCare.png"))); // NOI18N

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        insertConsults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        insertConsults.setText("Registrar Consulta");
        insertConsults.addActionListener(this::insertConsultsActionPerformed);

        updateConsults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateConsults.setText("Editar Consulta");
        updateConsults.addActionListener(this::updateConsultsActionPerformed);

        listConsults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listConsults.setText("Listar Consultas");
        listConsults.addActionListener(this::listConsultsActionPerformed);

        removeConsults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        removeConsults.setText("Excluir Consulta");
        removeConsults.addActionListener(this::removeConsultsActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel2.setText("Gerenciar Consultas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updateConsults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listConsults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeConsults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertConsults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(1029, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(insertConsults, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateConsults, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listConsults, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeConsults, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertConsultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertConsultsActionPerformed
        int codigo = principal.gerarIdConsulta();
        
        // * adicionar listagem de animais para que o usuário saiba qual informar *
        Integer idAnimal = principal.validarEntradaInteiro("Insira o código do animal:");
        // verificando se a entrada digitada pelo usuário é válida
        if (idAnimal == null) {
            return;
        }
        
        // verificando se o animal existe
        Animal animal = principal.buscarAnimalCodigo(idAnimal);
        if (animal == null) {
            JOptionPane.showMessageDialog(null, "Animal inexistente! A operação será cancelada.");
            return;
        }
        
        // * adicionar pergunta para cadastro de animal *
        
        // * adicionar listagem de veterinários para que o usuário saiba qual informar *
        Integer idVeterinario = principal.validarEntradaInteiro("Insira o código do veterinário:");
        if (idVeterinario == null) {
            return;
        }
        
        Funcionario veterinario = principal.buscarFuncionarioCodigo(idVeterinario);
        if (veterinario == null) {
            JOptionPane.showMessageDialog(null, "Veterinário inexistente! A operação será cancelada.");
            return;
        }
        
        // * adicionar pergunta para cadastro de veterinário *
        
        String dtConsulta = principal.validarEntradaData("Data da consulta: ");
        if (dtConsulta == null) {
            return;
        }
        
        String horaConsulta = principal.validarEntradaHora("Horário da consulta:");
        if (horaConsulta == null) {
            return;
        }
        
        String diagnostico = principal.validarEntradaTexto("Diagnóstico do paciente:");
        if (diagnostico == null) {
            return;
        }
        
        Double vlConsulta = principal.validarEntradaDouble("Valor da consulta:");
        if (vlConsulta == null) {
            return;
        }
        
        int confirmacao = JOptionPane.showConfirmDialog (
                null,
                "Deseja finalizar o registro da consulta " + codigo + '?',
                "Confirmção",
                JOptionPane.YES_NO_OPTION
        );
        
        if (confirmacao == JOptionPane.YES_OPTION) {
            Veterinario v = (Veterinario) veterinario;  // afirma que o funcionário criado acima É um veterinário
            listaConsultas.add(new Consulta(codigo, animal, v, dtConsulta, horaConsulta, diagnostico, vlConsulta));
            taSaida.setText("Consulta registrada!");
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }
    }//GEN-LAST:event_insertConsultsActionPerformed

    private void updateConsultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateConsultsActionPerformed

    }//GEN-LAST:event_updateConsultsActionPerformed

    private void listConsultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listConsultsActionPerformed

    }//GEN-LAST:event_listConsultsActionPerformed

    private void removeConsultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeConsultsActionPerformed

    }//GEN-LAST:event_removeConsultsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertConsults;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listConsults;
    private javax.swing.JButton removeConsults;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JButton updateConsults;
    // End of variables declaration//GEN-END:variables
}

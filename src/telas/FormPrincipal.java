package telas;

// import das classes
import classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FormPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPrincipal.class.getName());
    final ArrayList<Animal> listaAnimais = new ArrayList();
    final ArrayList<Tutor> listaTutores = new ArrayList();
    final ArrayList<Funcionario> listaFuncionarios = new ArrayList();
   
    
    public FormPrincipal() {
        initComponents();
        inserirDireto();
    }
    
    public Animal buscarAnimalCodigo(int idAnimal) {
        
        for (Animal a : listaAnimais) {
            if (a.getIdAnimal() == idAnimal) {
                return a;
            }
        }
        
        return null;
    }
    
    public boolean telefoneValido(String num){ 
        return (num.length() == 11); //retorna True caso o telefone seja válido (11 dígitos)
    }
    
    public Tutor buscarTutorCodigo(int idTutor) {
        
        for (Tutor t : listaTutores) {
            if (t.getIdTutor() == idTutor) {
                return t;
            }
        }
        
        return null;
    }
    
    public Funcionario buscarFuncionarioCodigo(int codFuncionario) {
        
        for (Funcionario f : listaFuncionarios) {
            if (f.getCodFuncionario() == codFuncionario) {
                return f;
            }
        }
        
        return null;
    }
    
    public void inserirDireto() {
        // funcionarios
        ArrayList<String> tels1 = new ArrayList();
        tels1.add("99123465783");
        tels1.add("63912678490");
        listaFuncionarios.add(new Recepcionista(12026, "Ana Banana", tels1));
        
        ArrayList<String> tels2 = new ArrayList();
        tels2.add("63923409648");
        listaFuncionarios.add(new Veterinario(22026, "Rone Marrone", tels2, "263463", "Dermatologista"));
        
        ArrayList<String> tels3 = new ArrayList();
        tels3.add("62394710264");
        tels3.add("48210275942");
        tels3.add("63251983745");
        listaFuncionarios.add(new Recepcionista(32026, "Elis Feliz", tels3));
        
        // tutores
        Tutor tutor1 = new Tutor("Maria Catita", 1, "99991449730");
        listaTutores.add(tutor1);
        
        Tutor tutor2 = new Tutor("Louro José", 2, "98263789176");
        listaTutores.add(tutor2);
        
        // animais
        listaAnimais.add(new Animal(1, "Amora", "Chachorro", "Vira-Lata", "Fêmea", "04/02/2026", 12.3, tutor1));
        listaAnimais.add(new Animal(2, "Regina", "Gato", "Siamês", "Fêmea", "10/12/2025", 1.23, tutor2));
        listaAnimais.add(new Animal(3, "Gisele Pinscher", "Cachorro", "Pinscher(Satanás)", "Fêmea", "05/01/2024", 1.48, tutor2));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gerenciarVets = new javax.swing.JButton();
        gerenciarAnms = new javax.swing.JButton();
        btnGerenciarTutores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gerenciarVets.setText("Gerenciar Veterinário");
        gerenciarVets.addActionListener(this::gerenciarVetsActionPerformed);

        gerenciarAnms.setText("Gerenciar Animal");
        gerenciarAnms.addActionListener(this::gerenciarAnmsActionPerformed);

        btnGerenciarTutores.setText("Gerenciar Tutores");
        btnGerenciarTutores.addActionListener(this::btnGerenciarTutoresActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGerenciarTutores, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gerenciarVets, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gerenciarAnms, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(gerenciarVets)
                .addGap(18, 18, 18)
                .addComponent(gerenciarAnms)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGerenciarTutores)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerenciarVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarVetsActionPerformed
        FormVeterinario telaVeterinario = new FormVeterinario(this, true, listaFuncionarios);
        telaVeterinario.setVisible(true);
    }//GEN-LAST:event_gerenciarVetsActionPerformed

    private void gerenciarAnmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarAnmsActionPerformed
            FormAnimais telaAnimais = new FormAnimais(this, true, listaAnimais, listaTutores);
            telaAnimais.setVisible(true);
    }//GEN-LAST:event_gerenciarAnmsActionPerformed

    private void btnGerenciarTutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarTutoresActionPerformed
        FormTutores telaTutores = new FormTutores(this,true,listaAnimais, listaTutores);
        telaTutores.setVisible(true);
    }//GEN-LAST:event_btnGerenciarTutoresActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new FormPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerenciarTutores;
    private javax.swing.JButton gerenciarAnms;
    private javax.swing.JButton gerenciarVets;
    // End of variables declaration//GEN-END:variables
}
